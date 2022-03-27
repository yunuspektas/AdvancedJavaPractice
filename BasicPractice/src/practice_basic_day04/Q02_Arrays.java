package practice_basic_day04;

public class Q02_Arrays {
    public static void main(String[] args) {

        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int[] input = {1,2,3,4,5,6,7};
        double averageValueOfArray = findAverageValueOfArray(input);

        System.out.println("The average of given Array is : " + averageValueOfArray);
        System.out.print("The element that greater tan the average of the array : ");
        findGreaterThanTheAverage(input , averageValueOfArray);

    } // main

    public static void findGreaterThanTheAverage(int[] input, double averageValueOfArray) {

        for (int i = 0; i < input.length ; i++) {
            if(input[i] > averageValueOfArray) System.out.print(input[i] + " ");
        }
    } // method

    public static double findAverageValueOfArray(int[] input) {
        double sum = 0;
        for (int i = 0; i < input.length ; i++) {

            sum += input[i];

        }
        return (sum/ input.length) ;

    } // method
}
