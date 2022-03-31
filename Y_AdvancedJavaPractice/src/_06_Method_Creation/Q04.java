package _06_Method_Creation;

import java.util.Scanner;



public class Q04 {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir kelime giriniz : " );
        String word = scan.next();

        stringgManipulation(word);



    }

    private static void stringgManipulation(String word) {
        if(word.contains("xyz")) System.out.println("true");
        else System.out.println("false");
    }

}
