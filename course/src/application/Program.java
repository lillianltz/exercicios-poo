package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC; // lados dos triângulos x e y
		
		System.out.println("Informe os lados do triângulo x: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Informe os lados do triângulo y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
		System.out.printf("A área do triângulo x é %.4f%n", areaX);
		
		System.out.printf("A área do triângulo y é %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.printf("A maior área é a do triângulo x: %.4f%n", + areaX);
		} else {
			System.out.printf("A maior área é a do triângulo y: %.4f%n", + areaY);
		}
		
		
		
		sc.close(); 

	}

}
