package com.im.reflect;

public class Boy extends Person implements Fightable{
	public Girl gf;
	
	public Boy() {
		
	}
	
	public Boy(String name, int age) {
		
	}

	@Override
	public void fight() {
		System.out.println("Fight...........");
		
	}
}
