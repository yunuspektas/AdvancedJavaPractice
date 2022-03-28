package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(" Toplama için 1\n Çıkarma için 2\n Bölme için 3\n Çarpma için 4 ");
		int islem=scan.nextInt();
		System.out.println("lütfen iki tam sayı giriniz :");

		int num1 = scan.nextInt();
		int num2 = scan.nextInt(); // kursor hangi satırda ise ctrl+D klonlama yapıyor

		if (islem ==1 ){
			System.out.println("toplama isleminin sonucu : " + num1 + " + " + num2 + " = " + (num1+num2));
		} else if (islem==2){
			System.out.println("cıkarma isleminin sonucu : " + num1 + " - " + num2 + " = " + (num1-num2));
		} else if (islem ==3){
			System.out.println("bolme isleminin sonucu : " + num1 + " / " + num2 + " = " + (num1/num2));
		} else if (islem ==4){
			System.out.println("carpma isleminin sonucu : " + num1 + " * " + num2 + " = " + (num1*num2));
		} else System.out.println("Hanlıs islem yaptınız");
	}

}
