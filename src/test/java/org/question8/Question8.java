package org.question8;

import org.testng.annotations.Test;

import BaseClass.BaseClass;

public class Question8 extends BaseClass{

	@Test
	private void tc() {
		openChromeBrowser();
		launchUrl("http://www.greenstechnologys.com/");
		maxWindow();

	}
	
}
