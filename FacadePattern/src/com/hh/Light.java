package com.hh;

public class Light {
	private String position;

	public Light(String position) {
		super();
		this.position = position;
	}
	
	public void on() {
		System.out.println(this.position+"�ƴ���");
	}
	
	public void off() {
		System.out.println(this.position+"�ƹ���");
	}
	
}
