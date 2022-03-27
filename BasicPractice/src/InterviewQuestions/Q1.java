package InterviewQuestions;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {

        /*
  Kullanicidan bir String aliniz.
  String'de var olan her character'in sayisini ekrana yazdiriniz.
  Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
         abaa   ==> a=3  b=1
        */

        String word = "abaabbc";
        String arr[] = word.trim().split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int count = 0;
        System.out.println(word);
        for (int i = 0; i < arr.length ; i++) {
            if(i==arr.length-1) {

                System.out.println(arr[i] + " = " + (count+1));
                break;
            }
            if (arr[i].equals(arr[i + 1])) {
                count++;

            } else {
                System.out.print(arr[i] + " = " + (count+1) + " ");
                count =0;
            }


        }


    }

}
