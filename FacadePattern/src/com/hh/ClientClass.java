package com.hh;

public class ClientClass {
	public static void main(String args[]){
		
		GeneralSwitchFacade gsf=new GeneralSwitchFacade();//
		System.out.println("------全部打开------");
		gsf.on();
		System.out.println("------全部关闭------");
		gsf.off();
	}	
}
