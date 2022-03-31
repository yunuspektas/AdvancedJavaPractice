package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */
        Scanner scan = new Scanner(System.in);

        System.out.println("Hızınızı giriniz");
        int speed = scan.nextInt();

        System.out.println("Ehliyetiniz var mı ? Varsa E Yoksa H yazınız");
        char driverLicence = scan.next().toUpperCase().charAt(0);

        int result = 0;
        result = (driverLicence == 'E') ? 0 : 200;

        if (speed > 55 && speed < 74) {
            result += 100;
        } else if (speed > 75 && speed < 84) {
            result += 150;
        } else if (speed > 85 && speed < 94) {
            result += 320;
        } else if (speed > 94) result += 500;

        System.out.println("Hızınız " + speed + " iken cezanız : " + result + " $");


    }
}
