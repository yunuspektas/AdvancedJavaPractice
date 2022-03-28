package _07_ForLoop;

public class Q16 {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */
        for (int i =65; i <=70 ; i++) {
            for (int j = 65; j <=i ; j++) {
                System.out.print((char)i + " ");
            }
            System.out.println(" ");

        }


    }

}
