package practice_basic_day04;

import java.util.Scanner;

public class Q05_Arrays {
    public static void main(String[] args) {
       /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.println("Lütfen dizi için 8 adet integer deger giriniz : ");
        int count=0;

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scan.nextInt();

        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%3==0) count++;
        }

        System.out.println("Girdiğiniz listede 3 e bölünebilen " + count + " tane sayı vardır");



    }
}
