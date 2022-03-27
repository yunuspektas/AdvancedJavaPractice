package InterviewQuestions;

public class Q3 {
    public static void main(String[] args) {

        /*
        Ask user enter a positive number and check if it is prime or not
        Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
        */

        int num = 13 ;
        boolean isPrime = true;

        for (int i = 2; i <num ; i++) {
            if(num%i==0) {
                isPrime = false;
                break;
            }
        }
        if(isPrime) System.out.println("Number is prime ");
        else System.out.println("Number is not a prime");

    }
}
