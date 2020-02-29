package com.hh.demo;

public class ClientTest {
  public static void main(String [] args) throws CloneNotSupportedException {
	  MyFruit fru1=new Apple();
	  MyFruitStore.add(1,fru1);
	  MyFruit fru2=(Apple)fru1.clone();
	  MyFruitStore.add(2,fru2);
	  MyFruit fru3=new Orange();
	  MyFruitStore.add(3,fru3);
	  MyFruit fru4=(Orange)fru3.clone();
	  MyFruitStore.add(4,fru4);
	  InewJuicer newJuicer=new Adapter();
	  System.out.println(newJuicer.newPort(fru1, fru3));
  }
}
