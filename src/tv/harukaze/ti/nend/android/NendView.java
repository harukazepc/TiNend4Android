/**
* This file was auto-generated by the Titanium Module SDK helper for Android
* Appcelerator Titanium Mobile
* Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
* Licensed under the terms of the Apache Public License
* Please see the LICENSE included with this distribution for details.
*
*/
package tv.harukaze.ti.nend.android;

import org.appcelerator.titanium.util.Log;
import org.appcelerator.titanium.view.TiUIView;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.kroll.KrollDict;
import net.nend.android.NendAdView;

public class NendView extends TiUIView
{
	private NendAdView nendAdView =null;

	// Constructor
	public NendView(final TiViewProxy proxy) {
		super(proxy);
		nendAdView = new NendAdView(proxy.getActivity(), Tinend4androidModule.Spotid, Tinend4androidModule.Apikey);
	    setNativeView(nendAdView);
	}

	@Override
	public void processProperties(KrollDict d){
		super.processProperties(d);
	}
}