package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
        int sayi = 6;
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("x");
            }
            for (int j = i; j <= sayi; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }



    }
}


