//
// Dynamsoft JavaScript Library for Basic Initiation of Dynamic Web TWAIN
// More info on DWT: http://www.dynamsoft.com/Products/WebTWAIN_Overview.aspx
//
// Copyright 2017, Dynamsoft Corporation 
// Author: Dynamsoft Team
// Version: 13.2
//
/// <reference path="dynamsoft.webtwain.initiate.js" />
var Dynamsoft = Dynamsoft || { WebTwainEnv: {} };

Dynamsoft.WebTwainEnv.AutoLoad = true;

///
Dynamsoft.WebTwainEnv.Containers = [{ContainerId:'dwtcontrolContainer', Width:270, Height:350}];

/// If you need to use multiple keys on the same server, you can combine keys and write like this 
/// Dynamsoft.WebTwainEnv.ProductKey = 'key1;key2;key3';
Dynamsoft.WebTwainEnv.ProductKey = 'E479F8C6449CCC94C90889B9D47E98309C1D513A4D6A354F44E2CC00104E3D951AA5EC90DC01329EFCB44356C7F2EE7C1AA5EC90DC01329EC9521DC0F7C7412A9C1D513A4D6A354F244AE445CC161D7340000000;t0068WQAAACRthzizsJhQMrXQd6ErdAiZ+0MlOCy29/W44ckuISD/QZv3jfU4LqGxnNZwhMz+pH7u2CN0+ngY6BgQl6dWqTQ=';

///
Dynamsoft.WebTwainEnv.Trial = true;

///
Dynamsoft.WebTwainEnv.ActiveXInstallWithCAB = false;

///
// Dynamsoft.WebTwainEnv.ResourcesPath = 'Resources';

/// All callbacks are defined in the dynamsoft.webtwain.install.js file, you can customize them.
// Dynamsoft.WebTwainEnv.RegisterEvent('OnWebTwainReady', function(){
// 		// webtwain has been inited
// });

