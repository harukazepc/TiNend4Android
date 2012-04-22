TiNend4Android
===========================================

Nend module for Titanium Mobile (Android).
This module uses Nend Android SDK.

HOW TO USE IT
-----------------------------

	var tinendandroid = require('tv.harukaze.ti.nend.android');

	// set spotid
	tinend4android.setSpotid(spotid);
	// set apikey
	tinend4android.setApikey(apikey);

	// create admaker view
	var adView = tinendandroid.createNendView({bottom:0});

	window.add(adView);


QUICK INSTALL TiNend4Android
--------------------

0. Download this module Project
2. Download `Nend Android SDK` from Nend's Web Console
3. Copy `Nend Android SDK` jar file into `dist/modules/tv.harukaze.ti.nend.android/0.1/lib/`
4. Copy `dist/modules` folder into your Titanium Project ( ROOT/modules )


(OPTIONAL) INSTALL TiNend4Android
--------------------

0. Download this module project
1. Download `Nend Android SDK` from Nend's Web Console
2. Make `lib` folder, and Put `Nend Android SDK` inside your module project
3. Check `build.properties` file and replace the path of SDKs
4. From command line, run this inside your module project:
	% ant run
5. Copy this zip file (at `dist` folder) into the folder of your Titanium Project
6. If you build the titanium project, the zip will be unziped and placed to you module folder


REGISTER TO YOUR PROJECT
---------------------

Register your module with your application by editing `tiapp.xml` and adding your module.
Example:

	<modules>
		<module version="0.1" platform="android">tv.harukaze.ti.nend.android</module>
	</modules>

When you run your project, the compiler will know automatically compile in your module
dependencies and copy appropriate image assets into the application.


LICENSE
---------------------
MIT License

Copyright 2011 Tomoya Narita 
http://harukaze.tv/
http://d.hatena.ne.jp/harukazepc/
Twitter: @harukazepc