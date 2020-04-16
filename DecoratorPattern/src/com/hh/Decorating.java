package com.hh;

public class Decorating implements IBirthdayCake {
	private IBirthdayCake birthdayCake;
	

	public Decorating(IBirthdayCake birthdayCake) {
		super();
		this.birthdayCake = birthdayCake;
	}


	@Override
	public void show() {
		// TODO Auto-generated method stub
		birthdayCake.show();

	}


}
