package practice_basic_day04;

public class Q09_Arrays {
    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
        int sumOfEvenNumbers = 0;
        int [][] input =  {{1,3,6},{2,8},{5,7,9,14}};
        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <input[i].length ; j++) {

                if(input[i][j]%2==0) sumOfEvenNumbers += input[i][j] ;

            }

        }
        System.out.println("Arraydeki cift sayilarin toplami : " + sumOfEvenNumbers);


    }
}
