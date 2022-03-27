package StringManipulationQuestions;

public class Q4 {
    public static void main(String[] args) {

        //How to swap two Strings without using a third variable?

        String str1 = "Ahmet";
        String str2 = "Mehmet";

        str1=str1 + str2 ;
        str2= str1.substring(0, str1.length()- str2.length());
        str1= str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);

        }


}
