package practice_basic_day03;

import java.util.Scanner;

public class Q01_MethodCreation01 {

    /*
      Problem Tanımı :
      Basit 4 islem yapan bir hesap makinesi kodlayiniz....
      Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalinız.
      Kullanicidan iki sayi girmesini isteyiniz.
      Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
    */

    public static void main(String[] args) {

        chooseOperation();
    }

    private static void chooseOperation() {
        System.out.println("Yapmak istediğiniz işlemi seçin :  \nToplama için + \nÇıkarma için - \nBölme için / \nÇarpma için * \nseçiniz");
        Scanner scan = new Scanner(System.in);
        String secim = scan.next();

        System.out.print("ilk sayıyı giriniz : ");
        int num1 = scan.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        int num2 = scan.nextInt();

        if ( secim.equals("+")) {
            System.out.println("toplama işleminin sonucu : " + (num1+num2));
        } else if ( secim.equals("-")){
            System.out.println("çıkarma işleminin sonucu : " + (num1-num2));
        } else if ( secim.equals("*")){
            System.out.println("çıkarma işleminin sonucu : " + (num1*num2));
        } else if ( secim.equals("/")){
            System.out.println("çıkarma işleminin sonucu : " + (num1/num2));
        }
    }


}