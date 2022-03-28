package _08_While_DoWhile;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q11 {

    /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false

         */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir sayi giriniz : ");
        int num1 = scan.nextInt();
        boolean isSqrt = false;

        for (int i = 1; i < num1; i++) {
            if ((i * i) == num1) {
                System.out.println("true \nNot: bu sayı tamkare " + i + " * " + i + " = " + num1);
                isSqrt = true;
            }
        }
        if ((!isSqrt)) System.out.println("false");


    }
}
