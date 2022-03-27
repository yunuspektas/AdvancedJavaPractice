package practice_basic_day04;

public class Q07_Arrays {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int[][] arr1 = {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};
        int minNumber = arr1[0][0];

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {
                if(arr1[i][j] < minNumber) minNumber = arr1[i][j] ;
            }

        }

        System.out.println("Array içindeki en küçük sayı : " + minNumber);


    }
}
