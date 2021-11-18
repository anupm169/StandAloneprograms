package com.zeenet.factorymethod;

public class Shop extends Website {

	@Override
	public void createWebsite() {

		pages.add(new SearchPage());
		pages.add(new ItemPage());
		pages.add(new CartPage());

	}

}
