package _03_IfStatement_TernaryOperator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		   hatali giris seklinde code create ediniz
		 */
		System.out.println("Lutfen bir harf giriniz : ");
		Scanner scan = new Scanner(System.in);
		char harf = scan.next().charAt(0);

		if ( harf>='A' && harf<='Z' ){
			System.out.println("Büyük harf");
		} else if ( harf>='a' && harf<='z' ){
			System.out.println("Küçük harf");
		} else System.out.println("Hatalı giriş yaptınız");
		

	

	}

}
