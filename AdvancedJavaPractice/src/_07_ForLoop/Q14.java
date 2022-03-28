package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

    /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütden bir sayı giriniz : ");
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i + j >= (num-1)) System.out.print("x");
                else System.out.print(" ");
            }
            System.out.println("");
        }







    }
}
