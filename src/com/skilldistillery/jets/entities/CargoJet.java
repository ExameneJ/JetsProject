package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier {

	
	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	public void loadCarrier() {
		System.out.println("Loading Carriers");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}
