package com.skilldistillery.jets.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

import javax.lang.model.element.NestingKind;

public class AirField {

	private ArrayList<Jet> fleetArrayList = new ArrayList<>();

	public void readFile() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			String model;
			int speed;
			int range;
			long price;
			while ((line = bufIn.readLine()) != null) {
				String[] values = line.split(",");
				model = values[1];
				speed = Integer.parseInt(values[2]);
				range = Integer.parseInt(values[3]);
				price = Long.parseLong(values[4]);

				if (values[0] != null && !values[0].isEmpty()) {

					if (values[0].equals("Cargo")) {

						Jet cargoCarrier = new CargoJet(model, speed, range, price);

						fleetArrayList.add(cargoCarrier);

					}

					if (values[0].equals("Fighter")) {
						Jet fighter = new FighterJet(model, speed, range, price);
						fleetArrayList.add(fighter);
					}

					if (values[0].equals("Jet")) {
						JetImpl jetImpl = new JetImpl(model, speed, range, price);
						fleetArrayList.add(jetImpl);

					}

				}
			}

		} catch (

		IOException e) {
			System.err.println(e);
		}

	}

	public void getList() {
		int num = 1;
		for (Jet jet : fleetArrayList) {
			String output = num + " " + "Model = " + jet.getModel() + " " + " Speed = " + jet.getSpeed() + ", Range = "
					+ jet.getRange() + ", Price = " + jet.getPrice();

			num++;
			System.out.println(output);

		}

	}

	public void getFlightTime() {
		int num = 1;

		for (Jet jet : fleetArrayList) {
			String output = num + " " + "Model = " + jet.getModel() + " " + " Speed = " + jet.getSpeed() + ", Range = "
					+ jet.getRange() + ", Price = " + jet.getPrice() + " Flight time = "
					+ jet.getRange() / jet.getSpeed();

			num++;
			System.out.println(output);
		}

	}

	public void fastestJet() {

		double highestSpeed = 0;
		int counter = 0;
		for (Jet jet : fleetArrayList) {
			if (jet.getSpeed() > highestSpeed) {
				highestSpeed = jet.getSpeed();
				counter = fleetArrayList.indexOf(jet);

			}

		}
		System.out.println(fleetArrayList.get(counter));

	}

	public void longestRange() {
		double highestRange = 0;
		int counter = 0;
		for (Jet jet : fleetArrayList) {
			if (jet.getRange() > highestRange) {
				highestRange = jet.getRange();
				counter = fleetArrayList.indexOf(jet);

			}

		}

		System.out.println(fleetArrayList.get(counter));

	}

	public void getCargo() {
		for (Jet jet : fleetArrayList) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCarrier();
				System.out.println(jet);

			}

		}
	}

	public void getFighers() {
		for (Jet jet : fleetArrayList) {
			if (jet instanceof Fighter) {
				((Fighter) jet).fight();
				System.out.println(jet);

			}
		}

	}
	
	public void addJet(Jet jet) {
		fleetArrayList.add(jet);
		
		
		
	}
	
	public void removeJet(int num) {
		fleetArrayList.remove(num -1);
		getList();
		
		
		
		
	}

}
