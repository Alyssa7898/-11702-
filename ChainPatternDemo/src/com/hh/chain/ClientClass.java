package com.hh.chain;

import java.util.Random;

public class ClientClass {

	public static void main(String args[]) {
		AbstractFruitSort Bfs,Mfs,Sfs;
		Bfs=new BigFruitSorting(9);
		Mfs=new MidFruitSorting(5);
		Sfs=new SmallFruitSorting(2);
		Bfs.setNextSort(Mfs);
		Mfs.setNextSort(Sfs);
		Random r=new Random();
		for(int i=0;i<1000;i++) {
			int weight=r.nextInt(10);
			Bfs.sendFruit(weight, "Ёхвс");
		}
		Bfs.getFruitBox();
		Mfs.getFruitBox();
		Sfs.getFruitBox();
	}
}
