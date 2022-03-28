package _07_ForLoop;

public class Q15 {

    /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */
    public static void main(String[] args) {

        for (int i = 65; i <=70 ; i++) {
            for (int j = 65; j <=i ; j++) {
                System.out.print((char)j + " ");
            }
            System.out.println("");
        }

    }
}
