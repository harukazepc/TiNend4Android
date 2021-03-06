/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package tv.harukaze.ti.nend.android;

import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.view.TiUIView;
import org.appcelerator.titanium.proxy.TiViewProxy;

import android.app.Activity;
import tv.harukaze.ti.nend.android.NendView;

// This proxy can be created by calling Timedibaad4android.createExample({message: "hello world"})
@Kroll.proxy(creatableInModule=Tinend4androidModule.class)
public class NendViewProxy extends TiViewProxy
{
	// Standard Debugging variables
	private NendView adView;
	
	// Constructor
	public NendViewProxy() {
		super();
	}

	@Override
	public TiUIView createView(Activity arg0) {
		adView = new NendView(this);
		return adView;
	}
}