package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz : ");
        int num1 = scan.nextInt();
        int i = 0;
        while(i <=num1) {
            if(i%2!=0){
                System.out.print(i + " ");
            }
            i++;
        }



    }
}
