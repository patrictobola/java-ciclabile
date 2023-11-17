package org.java;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 5, 8, 9, 15, 123};
		Ciclatore ciclatore = new Ciclatore(numbers);
		Ciclatore ciclatoreProva = new Ciclatore();
		
//		ciclatore con parametro con elementi fissi
		while(ciclatore.hasNextNumber()) {
			int number = ciclatore.nextNumber();
			System.out.println("Numero: " + number);
		}
		
		
//		ciclatore senza parametro con aggiunta di elemento in array
		ciclatoreProva.addElemento(4);
		ciclatoreProva.addElemento(15);
		
		while(ciclatoreProva.hasNextNumber()) {
			int number = ciclatoreProva.nextNumber();
			System.out.println("Numero: " + number);
		}
	}

}
