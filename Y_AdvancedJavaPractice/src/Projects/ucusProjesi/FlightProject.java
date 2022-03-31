package Projects.ucusProjesi;

import java.util.Scanner;

public class FlightProject {
    public static void main(String[] args) {
         /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Uçuş yapmak istediğiniz şehri seçiniz : \nB şehri için 1 \nC şehri için 2 \nD şehri için 3  e basınız : ");
        int choosenCityNo = scan.nextInt();

        System.out.print("Lütfen yaşınızı giriniz : ");
        int age = scan.nextInt();

        System.out.print("Gidiş-dönüş bileti almak istermisiniz \n Evet için E tuşuna \n Hayır için H tuşuna basınız : ");
        boolean isReturn = scan.next().toUpperCase().equals("E");

        calculateTicketPrice(choosenCityNo, age, isReturn);
    }

    private static void calculateTicketPrice(int choosenCityNo, int age, boolean isReturn) {
        double price = switch (choosenCityNo) {
            case 1 -> 0.1 * 500;
            case 2 -> 0.1 * 700;
            case 3 -> 0.1 * 900;
            default -> 0.0;
        };
        if (isReturn) price *= 0.8;
        if (age < 12) {
            price *= 0.5;
            System.out.println("Yaşınız 12 den küçük olduğu için %50 indirim kazandınız.");
        } else if (age >= 12 && age < 24) {
            price *= 0.9;
            System.out.println("Yaşınız 12-24 arası olduğu için %10 indirim kazandınız.");
        } else if (age >= 65) {
            price *= 0.7;
            System.out.println("Yaşınız 65 den büçük olduğu için %30 indirim kazandınız.");
        }

        System.out.println("Yolculuk için ödemeniz gereken rakam : $" + price);

    }
}
