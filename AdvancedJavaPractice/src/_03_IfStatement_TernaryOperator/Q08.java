package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * TASK :

	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapan code create ediniz.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Aldıgınız ürün adedini giriniz : ");
		int adet = scan.nextInt();

		System.out.println("Ürünün liste fiyatını giriniz : ");
		double price = scan.nextDouble();

		System.out.println("Müşteri kartınız var mı ? Varsa E Yoksa H yazın : ");
		char card = scan.next().toUpperCase().charAt(0);

		if (card=='E'){
			if(adet>10){
				System.out.println("Kartınız oldugu için %20 indirim ile ürünlerinizi " + (price*adet*0.8) + " TL ye alabilirsiniz");
			} else System.out.println("Kartınız oldugu için %15 indirim ile ürünlerinizi " + (price*adet*0.85) + " TL ye alabilirsiniz");
		} else if (card=='H'){
			if(adet>10){
				System.out.println("Kartınız olmadığı için %15 indirim ile ürünlerinizi " + (price*adet*0.85) + " TL ye alabilirsiniz");
			} else System.out.println("Kartınız olmadığı için %10 indirim ile ürünlerinizi " + (price*adet*0.90) + " TL ye alabilirsiniz");
		} else System.out.println("Lutfen kart bilginizi doğru girin");


	}

}
