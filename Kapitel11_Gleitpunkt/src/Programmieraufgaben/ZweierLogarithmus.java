package Programmieraufgaben;

import java.util.Scanner;
import static java.lang.Math.*;

public class ZweierLogarithmus {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner( System.in );
		double x, zweierlog;
		
		System.out.println("Geben Sie ein double ein: ");
		x = in.nextDouble();
		
		zweierlog = (log(x)/log(2));
		System.out.println("Der Zweierlogarithmus von " + x 
				+ " ist " + zweierlog );
	}

}
