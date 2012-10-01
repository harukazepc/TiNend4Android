// This is a test harness for your module
// You should do something interesting in this harness 
// to test out the module and to provide instructions 
// to users on how to use it by example.


// open a single window
var window = Ti.UI.createWindow({
	backgroundColor:'white'
});
var label = Ti.UI.createLabel({width:'auto',height:'auto',text:'adtesting'});
window.add(label);

// TODO: write your module tests here
var tinend4android = require('tv.harukaze.ti.nend.android');

// set spotid
tinend4android.setSpotid(8999);
// set apikey
tinend4android.setApikey('db479c0b32fae24d1952c333ffe3325b6dc517e7');

// create admaker view
var nendView = tinend4android.createNendView({bottom:0,width:'auto',height:'48dp'});

window.add(nendView);
window.open();
