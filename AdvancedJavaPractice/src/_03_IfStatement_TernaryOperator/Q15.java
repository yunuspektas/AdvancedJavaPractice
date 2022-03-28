package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*
		  TASK :
		  Kullanici tarafindan girilen bir sayinin
		  mutlak degerini yazdiran code create ediniz.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Bir sayı giriniz :");
		double number = scan.nextDouble() ;

		if ( number >= 0 ) System.out.println("Mutlak değeri : " + number);
		else System.out.print("Mutlak değeri : " + (-1*number));



		
		
		
		
	}

}
