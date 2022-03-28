package _06_Method_Creation;

import java.util.Scanner;

public class Q08 {
    /*
      TASK :
      Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
      String parametreli return type li reverseWord isminde bir method create ediniz

       Test Data :
      İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
      Output : versin açıklığı zihin arkadaşlara Javacı Allah
       */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cümle giriniz : ");
        String input = scan.nextLine();
        input = input.trim();
        input = " " + input;
        String yeniCumle = "";

        int boslukSayisi = boslukSayisiniBul(input);
        int bosluk = input.lastIndexOf(" ");

        for (int i = 1; i <= boslukSayisi; i++) {
            bosluk = input.lastIndexOf(" ");
            yeniCumle += " " + input.substring(bosluk + 1, input.length());
            input = input.substring(0, bosluk);
        }


        System.out.println(yeniCumle.trim());
    }

    private static int boslukSayisiniBul(String input) {
        int boslukSayisi = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                boslukSayisi++;
            }

        }
        return boslukSayisi;
    }

}
