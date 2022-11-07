package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements Fighter{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public void fight() {
		System.out.println("Loading Flyers");
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	

}
