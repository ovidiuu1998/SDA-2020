package ro.unitbv.javadatatype;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
	
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Introdu nr 1");
		
		int nr1 = scanner.nextInt();
		int nr2 = scanner.nextInt();
		
		int a =nr1+nr2;
		System.out.println("numarul citit este:" +nr1);
		System.out.println("Adunarea celor 2 nr este:");
		System.out.println("Suma lor este: " +a );
		
		
	
	
	}

}
