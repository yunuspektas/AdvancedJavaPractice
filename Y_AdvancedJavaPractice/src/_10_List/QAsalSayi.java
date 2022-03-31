package _10_List;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
    public static void main(String[] args) {
        boolean isPrime = true;
        List <Integer> list = new ArrayList<>();

        for (int i = 99; i >2 ; i--) {
            for (int j = 2; j <i ; j++) {
                if(i%j==0) {
                    isPrime=false;
                    break;
                }

            }
            if(isPrime) list.add(i);
            isPrime = true;
        }
        System.out.print(list);

    }
}
