package HW1_StringManipulationQuestions;

public class Q1 {

    public static void main(String[] args) {
        
        //Klavyeden okunacak bir e-mail adresindeki kullanıcı adını ve sunucu adını ekrana yazdıran
        // bilgisayar programını Java dilinde yazınız.
        //e-mail adresi örneği: turkaslan@gmail.com
        //ekrana:
        //kullaniciadi: turkaslan
        //sunucu: gmail yazacak.

        String mail = "turkaslan@hotmail.com" ;
        int indexOfEt = mail.indexOf("@");
        int indexOfDot = mail.indexOf(".");

        String kullaniciAdi = kullaniciAdiBul(mail, indexOfEt );
        String sunucuAdi= sunucuAdiBul(mail, indexOfEt, indexOfDot );

        System.out.println("kullanıcıadi : " + kullaniciAdi);
        System.out.println("sunucu : "+ sunucuAdi);

    }

    public static String sunucuAdiBul(String mail, int indexOfEt, int indexOfDot) {
        String sunucu = mail.substring(indexOfEt+1, indexOfDot);
        return sunucu ;
    }

    public static String kullaniciAdiBul(String mail, int indexOfEt) {
        String kullaniciAdi = mail.substring(0, indexOfEt);


        return kullaniciAdi;
    }


}
