package tasks;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int num = scan.nextInt();

        PowersofTwo(num);
    }

    private static void PowersofTwo(int num) {

        while(num%2==0 && num!=0){
             num /= 2 ;

        }

        if( num ==1 )System.out.println("Girdiğiniz sayı 2 nin kuvvetidir.");
        else System.out.println("Girilen sayı 2 nin kuvveti değildir. ");
    }
}

