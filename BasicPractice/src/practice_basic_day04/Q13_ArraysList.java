package practice_basic_day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q13_ArraysList {
    public static void main(String[] args) {

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
            // önce sort. daha sonra n sayısı kadar sondan List elemanı yazdır

        List <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(8);

        int n = 2;
        int x = list.size()-1;

        Collections.sort(list); // işlem öncesi liste küçükten büyüğe sıralanıyor
        for (int i = n; i > 0 ; i--) {
            System.out.print(list.get(x) + " ") ;
            x--;
        }
    }

}
