package practice_basic_day04;

public class Q08_Arrays {
    public static void main(String[] args) {
      /*
       *  String 2D array olustur
       *  {{"$12" , "$22" , "$0"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
       *  String de $ varsa 3.2 ile carp
       *  String de € varsa 4.2 ile carp
       *  double olarak yazdir
       */

        String [][] money =  {{"$12" , "$22" , "$0"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};
        double dolarCarpan = 3.2;
        double euroCarpan = 4.2;
        double sonuc = 0.0;

        for (int i = 0; i < money.length ; i++) {
            for (int j = 0; j <money[i].length ; j++) {
                if(money[i][j].startsWith("$")) sonuc += (Double.valueOf(money[i][j].substring(1, money[i][j].length())) * dolarCarpan) ;
                if(money[i][j].startsWith("€")) sonuc += (Double.valueOf(money[i][j].substring(1, money[i][j].length())) * euroCarpan) ;

            }

        }

        System.out.println(sonuc);


    }
}
