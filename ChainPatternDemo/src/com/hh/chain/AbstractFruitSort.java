package com.hh.chain;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractFruitSort {
	private int weight;
	protected List<String>fruitBox;
	private AbstractFruitSort nextFruitSort;
	public void getFruitBox() {
		System.out.println("weight:"+weight);
		System.out.println("个数："+fruitBox.size());
		for(String t:fruitBox) {
			System.out.println(t+",");
		}
		System.out.println(" ");
	}
	public AbstractFruitSort(int weight) {
		this.weight=weight;
		fruitBox=new ArrayList<String>();
	}
	public void setNextSort(AbstractFruitSort nextFruitSort ) {
		this.nextFruitSort=nextFruitSort;
	}
	public void sendFruit(int weight,String fruit) {//有水果加入时
		if(this.weight<=weight)
			pushBox(fruit);
		else
			if(nextFruitSort!=null)
				nextFruitSort.sendFruit(weight,fruit);
	}
	abstract protected void pushBox(String fruit);
}
