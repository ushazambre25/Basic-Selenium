package com;

import org.testng.annotations.Test;

import Library.Browser;

public class sample {
	@Test
	public void setEnv() throws Exception {
		Browser.setupBrowser("FireFox");
		Browser.setUpURL("https://www.facebook.com");
	}

}
