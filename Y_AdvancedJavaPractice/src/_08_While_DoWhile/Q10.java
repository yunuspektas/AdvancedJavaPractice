package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
        Scanner scan = new Scanner(System.in);

        int min = 0;
        int max = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". sayiyi giriniz: ");
            int sayi = scan.nextInt();
            if (i == 1) {
                max = sayi;
                min = sayi;
            } else if (sayi > max) {
                max = sayi;
            } else if (sayi < min) {
                min = sayi ;
            }
        }
        System.out.println("En büyük sayi : " + max);
        System.out.println("En küçük sayi : " + min);


      /*
       if (num1>num2 && num1>num3 && num1>num4 && num1>num5) System.out.println("En büyük sayı : " + num1);
       if (num2>num1 && num2>num3 && num2>num4 && num2>num5) System.out.println("En büyük sayı : " + num2);
       if (num3>num1 && num3>num2 && num3>num4 && num3>num5) System.out.println("En büyük sayı : " + num3);
       if (num4>num2 && num4>num3 && num4>num1 && num4>num5) System.out.println("En büyük sayı : " + num4);
       if (num5>num2 && num5>num3 && num5>num4 && num5>num1) System.out.println("En büyük sayı : " + num5);

       */

    }

}



