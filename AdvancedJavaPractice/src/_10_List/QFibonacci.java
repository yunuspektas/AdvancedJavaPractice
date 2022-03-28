package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {

    int num = 35 ;
    List <Integer> list = new ArrayList<>();
    list.add(1);
    list.add(1);

        for (int i = 0; i <100 ; i++) {
           if(list.get(i)+list.get(i+1)<=num) list.add(list.get(i)+list.get(i+1));
            else break;
        }
        System.out.println(list);



    }
}
