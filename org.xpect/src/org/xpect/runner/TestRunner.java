/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.xpect.runner;

import java.lang.reflect.InvocationTargetException;

import org.junit.runner.Description;
import org.xpect.XjmTestMethod;
import org.xpect.setup.IXpectRunnerSetup;
import org.xpect.setup.SetupContext;

import com.google.common.base.Preconditions;

/**
 * @author Moritz Eysholdt - Initial contribution and API
 */
public class TestRunner extends AbstractTestRunner {

	private XjmTestMethod method;

	public TestRunner(XpectFileRunner uriRunner, XjmTestMethod method) {
		super(uriRunner);
		Preconditions.checkNotNull(method);
		this.method = method;
	}

	public Description createDescription() {
		Class<?> javaClass = getMethod().getTest().getJavaClass();
		return Description.createTestDescription(javaClass, getTitle());
	}

	public XjmTestMethod getMethod() {
		return method;
	}

	@Override
	protected String getTitle() {
		return method.getName();
	}

	@Override
	protected void runInternal(IXpectRunnerSetup<Object, Object, Object, Object> setup, SetupContext ctx) throws Throwable {
		Object test = method.getTest().getJavaClass().newInstance();
		ctx.setMethod(method);
		ctx.setTestInstance(test);
		try {
			if (setup != null)
				ctx.setUserTestCtx(setup.beforeTest(ctx, ctx.getUserFileCtx()));
			method.getJavaMethod().invoke(test);
		} catch (InvocationTargetException e) {
			throw e.getCause();
		} finally {
			if (setup != null)
				setup.afterTest(ctx, ctx.getUserTestCtx());
		}

	}

}
