/*
 * generated by Xtext
 */
package org.eclipse.xpect.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xpect.Assignment;
import org.eclipse.xpect.BooleanLiteral;
import org.eclipse.xpect.ClassLiteral;
import org.eclipse.xpect.Component;
import org.eclipse.xpect.IntLiteral;
import org.eclipse.xpect.StringLiteral;
import org.eclipse.xpect.Text;
import org.eclipse.xpect.XpectFile;
import org.eclipse.xpect.XpectIgnore;
import org.eclipse.xpect.XpectInvocation;
import org.eclipse.xpect.XpectPackage;
import org.eclipse.xpect.XpectTest;
import org.eclipse.xpect.services.XpectGrammarAccess;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class XpectSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XpectGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == XpectPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XpectPackage.ASSIGNMENT:
				sequence_Assignment(context, (Assignment) semanticObject); 
				return; 
			case XpectPackage.BOOLEAN_LITERAL:
				sequence_Literal(context, (BooleanLiteral) semanticObject); 
				return; 
			case XpectPackage.CLASS_LITERAL:
				sequence_ClassLiteral(context, (ClassLiteral) semanticObject); 
				return; 
			case XpectPackage.COMPONENT:
				if (rule == grammarAccess.getValueRule()
						|| rule == grammarAccess.getComponentInlineRule()) {
					sequence_ComponentInline(context, (Component) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getComponentLongRule()) {
					sequence_ComponentLong(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case XpectPackage.INT_LITERAL:
				sequence_Literal(context, (IntLiteral) semanticObject); 
				return; 
			case XpectPackage.STRING_LITERAL:
				sequence_Literal(context, (StringLiteral) semanticObject); 
				return; 
			case XpectPackage.TEXT:
				sequence_Text(context, (Text) semanticObject); 
				return; 
			case XpectPackage.XPECT_FILE:
				sequence_XpectFile(context, (XpectFile) semanticObject); 
				return; 
			case XpectPackage.XPECT_IGNORE:
				sequence_XpectIgnore(context, (XpectIgnore) semanticObject); 
				return; 
			case XpectPackage.XPECT_INVOCATION:
				sequence_Lexicalspace_Invocation(context, (XpectInvocation) semanticObject); 
				return; 
			case XpectPackage.XPECT_TEST:
				sequence_Lexicalspace_Setup(context, (XpectTest) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Assignment returns Assignment
	 *
	 * Constraint:
	 *     ((declaredTarget=[JvmOperation|ID] value=Value) | value=ComponentLong)
	 * </pre>
	 */
	protected void sequence_Assignment(ISerializationContext context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns ClassLiteral
	 *     ClassLiteral returns ClassLiteral
	 *
	 * Constraint:
	 *     type=[JvmDeclaredType|QualifiedName]
	 * </pre>
	 */
	protected void sequence_ClassLiteral(ISerializationContext context, ClassLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XpectPackage.Literals.CLASS_LITERAL__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XpectPackage.Literals.CLASS_LITERAL__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClassLiteralAccess().getTypeJvmDeclaredTypeQualifiedNameParserRuleCall_1_0_1(), semanticObject.eGet(XpectPackage.Literals.CLASS_LITERAL__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns Component
	 *     ComponentInline returns Component
	 *
	 * Constraint:
	 *     ((componentClass=[JvmDeclaredType|QualifiedName] parameters+=Literal*)? assignments+=Assignment*)
	 * </pre>
	 */
	protected void sequence_ComponentInline(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     ComponentLong returns Component
	 *
	 * Constraint:
	 *     (componentClass=[JvmDeclaredType|QualifiedName] parameters+=Literal* assignments+=Assignment*)
	 * </pre>
	 */
	protected void sequence_ComponentLong(ISerializationContext context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Member returns XpectInvocation
	 *     Lexicalspace_Invocation returns XpectInvocation
	 *
	 * Constraint:
	 *     (ignore?='!'? fixme?='FIXME'? method=[XjmXpectMethod|INVOCATION])
	 * </pre>
	 */
	protected void sequence_Lexicalspace_Invocation(ISerializationContext context, XpectInvocation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Member returns XpectTest
	 *     Lexicalspace_Setup returns XpectTest
	 *
	 * Constraint:
	 *     (declaredSuite=[JvmDeclaredType|QualifiedName]? assignments+=Assignment*)
	 * </pre>
	 */
	protected void sequence_Lexicalspace_Setup(ISerializationContext context, XpectTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns BooleanLiteral
	 *     Literal returns BooleanLiteral
	 *
	 * Constraint:
	 *     value?='true'?
	 * </pre>
	 */
	protected void sequence_Literal(ISerializationContext context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns IntLiteral
	 *     Literal returns IntLiteral
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_Literal(ISerializationContext context, IntLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XpectPackage.Literals.INT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XpectPackage.Literals.INT_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLiteralAccess().getValueINTTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Value returns StringLiteral
	 *     Literal returns StringLiteral
	 *
	 * Constraint:
	 *     value=STRING
	 * </pre>
	 */
	protected void sequence_Literal(ISerializationContext context, StringLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XpectPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XpectPackage.Literals.STRING_LITERAL__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Text returns Text
	 *
	 * Constraint:
	 *     text=AnyText
	 * </pre>
	 */
	protected void sequence_Text(ISerializationContext context, Text semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XpectPackage.Literals.TEXT__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XpectPackage.Literals.TEXT__TEXT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextAccess().getTextAnyTextParserRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     XpectFile returns XpectFile
	 *
	 * Constraint:
	 *     ((members+=Text members+=Member)* members+=Text)?
	 * </pre>
	 */
	protected void sequence_XpectFile(ISerializationContext context, XpectFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Member returns XpectIgnore
	 *     XpectIgnore returns XpectIgnore
	 *
	 * Constraint:
	 *     {XpectIgnore}
	 * </pre>
	 */
	protected void sequence_XpectIgnore(ISerializationContext context, XpectIgnore semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
