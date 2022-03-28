package _06_Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK: .

           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */

        String str = "ghost";

        System.out.println(changeString(str));


    }

    private static String changeString(String str) {
        String str2 ="";
        if (str.charAt(0) =='g' && str.charAt(1)=='h') str2=str;
        else if (str.charAt(0)=='g') str2=str.substring(0,1)+str.substring(2,str.length());
        else if(str.charAt(1)=='h') str2= str.substring(1,str.length());

        return str2;
    }


}

