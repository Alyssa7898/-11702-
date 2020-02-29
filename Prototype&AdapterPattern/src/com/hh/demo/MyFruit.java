package com.hh.demo;

public class MyFruit implements Cloneable{
 protected String kind;
 public Object clone() throws CloneNotSupportedException {
	 Object obj =null;
	 obj=super.clone();
	return obj;
	 
 }
 public void Display() {
	 
	 System.out.println(kind);
 }
public String Get() {
	// TODO Auto-generated method stub
  return kind;
}
}
