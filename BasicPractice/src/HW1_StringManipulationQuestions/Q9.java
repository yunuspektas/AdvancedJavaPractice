package HW1_StringManipulationQuestions;

public class Q9 {
    public static void main(String[] args) {
        ///*Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        //
        //    Kullanicidan bir sifre girmesini isteyin
        //    Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin. Ilk harf A ise
        //"Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
        //    Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin. Ilk harf z ise
        //"Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
        //    */

        String passWord ="zrftyg";

        if(passWord.charAt(0)>='A' && passWord.charAt(0) <='Z') {
            if(passWord.charAt(0)=='A') System.out.println("Geçerli şifre");
            else System.out.println("Gecersiz şifre");
        }

        if(passWord.charAt(0)>='a' && passWord.charAt(0) <='z') {
            if(passWord.charAt(0)=='z') System.out.println("Geçerli şifre");
            else System.out.println("Gecersiz şifre");
        }




    }
}
