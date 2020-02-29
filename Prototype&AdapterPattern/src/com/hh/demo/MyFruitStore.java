package com.hh.demo;
//原型管理器
import java.util.Hashtable;

public class MyFruitStore {
 private static Hashtable fruittable=new Hashtable<Integer, MyFruit>();
 public static void add(Integer key,MyFruit fruit) {
	 fruittable.put(key, fruit);
 }
 public  static MyFruit Get(Integer key) throws CloneNotSupportedException {
	 MyFruit fruit =(MyFruit) fruittable.get(key);
	return (MyFruit)fruit.clone();
 }
}
