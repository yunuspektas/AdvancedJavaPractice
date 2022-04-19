package JavaProjects.P04_okulYönetimi.ogrcOgrtYonetimi;

public class Ogrenci extends Kisi {

    private String ogrcNo;
    private String sınıf;

    public Ogrenci() {

    }

    public Ogrenci(String ogrcNo, String sınıf) {
        this.ogrcNo = ogrcNo;
        this.sınıf = sınıf;
    }

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String ogrcNo, String sınıf) {
        super(adSoyad, kimlikNo, yas);
        this.ogrcNo = ogrcNo;
        this.sınıf = sınıf;
    }

    public String getOgrcNo() {
        return ogrcNo;
    }

    public void setOgrcNo(String ogrcNo) {
        this.ogrcNo = ogrcNo;
    }

    public String getSınıf() {
        return sınıf;
    }



||||||| ce21405


=======
>>>>>>> f08342fb6e04d2bf143c3abfbb25d2b1b7e376a2
    @Override
    public String toString() {
        return "Ogrenci{" +
                " adSoyad='" + getAdSoyad() + '\'' +
                ", kimlikNo='" + getKimlikNo() + '\'' +
                ", yas=" + getYas() +
                ", ogrcNo='" + ogrcNo + '\'' +
                ", sınıf='" + sınıf + '\'' +
                "} " + super.toString();
    }

// @Override
   // public String toString() {
   //     return "Ogrenci{" +
   //             "ogrcNo='" + ogrcNo + '\'' +
   //             ", sınıf='" + sınıf + '\'' +
   //             '}';
   // }
}


