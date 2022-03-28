package _07_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        int num =0;
        int sum =0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <=5 ; i++) {
            System.out.print("Lütfen " + i + ". sayıyı giriniz : ");
            num = scan.nextInt();

            if(!(num>=5 && num <=10)) sum+=num;

        }
        System.out.println(sum);
    }

}
