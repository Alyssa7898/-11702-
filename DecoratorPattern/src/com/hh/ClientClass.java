package com.hh;

public class ClientClass {

	public static void main(String ares []) {
		IBirthdayCake birthdayCake=new Cake();
		birthdayCake.show();
		Cream cream=new Cream(birthdayCake);
		cream.putCream();
		Fruit fruit=new Fruit(cream);
		fruit.PutFruit();
		//fruit.show();
		
	}
}
