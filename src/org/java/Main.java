package org.java;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 5, 8, 9, 15, 123};
		Ciclatore ciclatore = new Ciclatore(numbers);
		
		while(ciclatore.hasNextNumber()) {
			int number = ciclatore.nextNumber();
			System.out.println("Numero: " + number);
		}
	}

}
