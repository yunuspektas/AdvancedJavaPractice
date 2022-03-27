package practice_basic_day04;

public class Q06_Arrays {
    public static void main(String[] args) {
        /*
        * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
        * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.

         */

        int[][] arr1 = { {0,2,-1}, {3,8,9}, {7} };
        int[][] arr2 = { {-7,6,-9}, {0,12}, {19} };
        int sum =0;
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum += arr1[i][j];
            } // inner
        } // outher

        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <arr2[i].length ; j++) {
                sum += arr2[i][j] ;
            } //inner

        } // outher

        System.out.println(sum);

    } // main
}
