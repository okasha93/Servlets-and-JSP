package org.okasha.model;

import org.okasha.databaseConnection.mySQLConnection;

public class Product {
	private int Price;
	private String Name;
	private String CategoryName;

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public boolean insertProduct() {
		mySQLConnection conc = new mySQLConnection();
		boolean f = conc.execute("INSERT INTO OnlineShop.Product(Name, Price, CategoryName)"
				+ "VALUES ('" + Name
				+ "', '" + Price + "', '" + CategoryName + "')");
		conc.close();
		return f;
	}

	public boolean getAllProduct() {
		mySQLConnection conc = new mySQLConnection();
		boolean f = conc.execute("SELECT * FROM Product");
		conc.close();
		return f;
	}
}