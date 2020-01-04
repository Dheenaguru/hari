package com.flipcart;

public class scrp extends Base {

	public static void main(String[] args) {
		launchChromeBrowser("https://www.flipkart.com/");
		C1 d = new C1();
		
		click(d.getF());
		click(d.getElectronic());
	}
}
