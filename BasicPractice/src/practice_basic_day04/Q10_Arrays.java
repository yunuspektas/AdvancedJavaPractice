package practice_basic_day04;

public class Q10_Arrays {
    public static void main(String[] args) {
     /*
      *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
      */

        String sentence = " Merhaba dünya nasılsın. ";

        sentence = sentence.replaceAll(" " , "");
        String[] arr = sentence.split("");

        System.out.println("Cümlemiz : " + sentence);
        System.out.println("Verilen bir cumledeki bosluklar haric character sayisi : " + arr.length);


    }
}
