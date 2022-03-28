package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */
		System.out.println(" 3 tane pozitif tam sayi giriniz :");

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (((num1+num2>num3) && (num3>num1-num2)) && ((num1+num3>num2) && (num2>num1-num3)) && ((num2+num3>num1) && (num1>num2-num3))) {
			System.out.println("Girdiğiniz degerler ile Üçgen olabilir");
			if (( num1==num2 ) && ( num2 == num3 ) ){
				System.out.println("Eş kenar üçgendir");

			} else System.out.println("Eşkenar üçgen değildir");
		} else System.out.println("Girdiğiniz degerler ile üçgen yapılamıyor..");
	
		

	}

}
