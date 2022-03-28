package _07_ForLoop;

import java.util.Scanner;

public class Q20 {
    /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 , 30 ve 40 icin EKOK = 120
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 2 tamsayı giriniz : ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        findGCD(num1, num2);
        findLCM(num1, num2);

    }

    private static void findLCM(int num1, int num2) {
        int max =0;
        int lcm = 13 ;
        if((num1-num2)<0) max=num2 ; else max=num1 ;
        for (int i = (num1*num2) ; i >=max; i--) {
            if ( (i%num1==0) && (i%num2==0)) lcm=i;
        }
        System.out.println("LCM = " + lcm);
    }

    private static void findGCD(int num1, int num2) {
        int max =0;
        int gcd = 1 ;
       if((num1-num2)<0) max=num2 ; else max=num1 ;
        for (int i = 1; i <=max ; i++) {
            if(num1%i==0 && num2%i==0 ) {
                gcd = i;
            }

        }
        System.out.println("GCD = " + gcd);
    }
}
