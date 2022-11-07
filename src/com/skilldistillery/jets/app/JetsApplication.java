package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.JetImpl;

public class JetsApplication{
	

	public static void main(String[] args) {
		AirField airField = new AirField();
		Scanner scanner = new Scanner(System.in);
		
		
		
		boolean iscontinue = true;
		airField.readFile();
		
		while (iscontinue) {
			
			
			System.out.println("1. List Fleet");
			System.out.println("2. Fly all jets");
			System.out.println("3. View fastest jet");
			System.out.println("4. View jet with longest range");
			System.out.println("5. Load all Cargo Jets");
			System.out.println("6. Dogfight!");
			System.out.println("7. Add a jet to Fleet");
			System.out.println("8. Remove a jet from Fleet");
			System.out.println("9. Quit");
			int inputInt = scanner.nextInt();
			if (inputInt == 1) {
				airField.getList();
				System.out.println();
				
				
			}
			if (inputInt == 2) {
				airField.getFlightTime();
				System.out.println();
				
				
				
			}
			if (inputInt == 3) {
				airField.fastestJet();
				System.out.println();
				
			}
			
			if (inputInt == 4) {
				airField.longestRange();
				System.out.println();
				
			}
			if (inputInt == 5) {
				airField.getCargo();
				System.out.println();
				
			}
			if (inputInt == 6) {
				airField.getFighers();
				System.out.println();
				
			}
			if (inputInt == 7) {
				System.out.println("Add Jet");
				System.out.println("Enter Model");
				
				String model = scanner.next();
				
				
				System.out.println("Enter Speed");
				Double speed = scanner.nextDouble();
				
				
				System.out.println("Enter range");
				Integer range = scanner.nextInt();
				
				
				System.out.println("Enter price");
				Long price = scanner.nextLong();
				
				JetImpl jetImpl = new JetImpl(model, speed, range, price);
				
				
				airField.addJet(jetImpl);
				System.out.println( "Added to list");
				
			}
			
			if (inputInt == 8) {
				airField.getList();
				System.out.println("Remove jet by number");
				Integer numInteger = scanner.nextInt();
			
				airField.removeJet(numInteger);
				System.out.println();
				
			}
			if (inputInt == 9) {
				System.out.println("Quitting program");
				iscontinue = false;
				break;
				
			}
			
			
			
			
			
			
		}
		
		
	}
	
	

}
