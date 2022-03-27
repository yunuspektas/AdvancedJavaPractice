package practice_basic_day04;

import java.sql.SQLOutput;
import java.util.*;

public class Q12_ArraysList {
    public static void main(String[] args) {
        /*
         * Kullanicidan int  list uzunlugunu isteyin
         * Listin uzunlugu kadar kullanicidan list elemanlarini girmesini isteyin
         * Tekrarli list elemanlarindan yeni bir list olusturan ve  yazdiran metod yazin
         *
         * n = 5 icin (listin uzunlugu);
         * input { 1 , 2 , 2 , 3 , 4}
         * output {2}
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Listenin uzunluğunu giriniz : " );
        int elementNumberOfList = scan.nextInt();
        List <Integer> list = new ArrayList<>();
        List <Integer> list2 = new ArrayList<>();

        for (int i = 0; i <elementNumberOfList ; i++) {
            System.out.print("Lütfen " + (i+1) + ". elemanı giriniz : ");
            list.add(scan.nextInt());

        }

        Collections.sort(list);

        for (int i = 0; i <list.size()-1 ; i++) {
            for (int j = i+1; j <i+2 ; j++) {
                if (list.get(i)==list.get(j)) {
                    if(!list2.contains(list.get(i))) list2.add(list.get(i));
                }

            }

        }

        System.out.println(list2);


    }
}
