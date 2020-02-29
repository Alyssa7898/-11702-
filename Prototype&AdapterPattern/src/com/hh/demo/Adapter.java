package com.hh.demo;

public class Adapter extends OldJuicer implements InewJuicer {

	@Override
	public String newPort(MyFruit fru1, MyFruit fru2) {
		// TODO Auto-generated method stub
		String str=onePort(fru1);
		str+=onePort(fru2);
		return str;
	}

}
