package practice_basic_day04;

public class Q04_Arrays {
    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
         * istenenToplam=9;
         */
        /*
			5 and 4 sum is 9
			7 and 2 sum is 9
			-6 and 15 sum is 9
			8 and 1 sum is 9
		*/

        int[] arr ={5,7,-6,4,2,15,3,8,1};
        int wantedSum = 9;

        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if( arr[i] + arr[j] == wantedSum) System.out.println(arr[i] + " and " + arr[j] + " sum is " + wantedSum);
            }

        }

    }

}
