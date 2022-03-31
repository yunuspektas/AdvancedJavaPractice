package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen yaşınızı giriniz : ");
		int age = scan.nextInt();

		System.out.println("Lutfen kilonuzu giriniz : ");
		double weight = scan.nextDouble();

		if ( age<18 ){
			System.out.println("Yasınız 18 den küçük olduğu için kan bağışı yapamazsınız..");
		} else if ( weight<50 ) {
			System.out.println("50 kilodan hafif oldugunuz için kan bağısı yapamazsınız");
		} else System.out.println("Kan bagısı yapabilirsiniz");


	}

}
