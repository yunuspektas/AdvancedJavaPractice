package _06_Method_Creation;

public class Q06 {

 /*
        TASK  :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
 public static void main(String[] args) {
     String input = "aabbcccccddddaaa";

     createNewInput(input);

 }

    private static void createNewInput(String input) {
        String newInput = "x";
        for (int i = 0; i <input.length() ; i++) {
           if(input.indexOf(input.substring(i , (i+1)))==input.lastIndexOf(input.substring(i , (i+1)))) newInput+=input.substring(i, (i+1));
            System.out.println(input.indexOf(input.substring(i , (i+1))));
            System.out.println(input.lastIndexOf(input.substring(i , (i+1))));

        }
        System.out.println(newInput);

    }






}
