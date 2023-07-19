lexer grammar XpectRT;

options {
	tokenVocab=InternalXpectLexer;
}

@header {
package org.eclipse.xpect.lexer;

// Use our own Lexer superclass by means of import.
import org.eclipse.xpect.services.Lexer;
}

@members{
	// state XpectFile = 2
	// state Lexicalspace_Setup = 4
	// state Lexicalspace_Invocation = 1
	private int tokenstate = 2;
}

XPECT_IGNORE: {(tokenstate & 2) != 0 && matches("XPECT_IGNORE")}?=> 'XPECT_IGNORE';
XPECT_SETUP: {(tokenstate & 2) != 0 && matches("XPECT_SETUP")}?=> 'XPECT_SETUP' {tokenstate=4;};
XPECT: {(tokenstate & 2) != 0 && matches("XPECT")}?=> 'XPECT' {tokenstate=1;};
EqualsSign: {(tokenstate & 4) != 0 && matches("=")}?=> '=';
LeftCurlyBracket: {(tokenstate & 4) != 0 && matches("{")}?=> '{';
RightCurlyBracket: {(tokenstate & 4) != 0 && matches("}")}?=> '}';
True: {(tokenstate & 4) != 0 && matches("true")}?=> 'true';
False: {(tokenstate & 4) != 0 && matches("false")}?=> 'false';
FullStop: {(tokenstate & 4) != 0 && matches(".")}?=> '.';
END_SETUP: {(tokenstate & 4) != 0 && matches("END_SETUP")}?=> 'END_SETUP' {tokenstate=2;};
ExclamationMark: {(tokenstate & 1) != 0 && matches("!")}?=> '!';
FIXME: {(tokenstate & 1) != 0 && matches("FIXME")}?=> 'FIXME';
RULE_ID: {(tokenstate & 4) != 0}?=> '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
RULE_INVOCATION: {(tokenstate & 1) != 0}?=> '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*  {tokenstate=2;};
RULE_INT: {(tokenstate & 4) != 0}?=> ('0'..'9')+;
RULE_STRING: {(tokenstate & 4) != 0}?=> ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');
RULE_ML_COMMENT: {(tokenstate & 5) != 0}?=> '/*' ( options {greedy=false;} : . )*'*/';
RULE_SL_COMMENT: {(tokenstate & 5) != 0}?=> '//' ~(('\n'|'\r'))* ('\r'? '\n')?;
RULE_WS: {(tokenstate & 5) != 0}?=> (' '|'\t'|'\r'|'\n')+;
RULE_ANY_OTHER:  .;

