package Modeller.Departmanlar;

public class InsanKaynaklariDepartmani implements Departman {

    final String departmanKodu = "IKD";

    // TODO Bu class'da sadece zam oranini belirtmelisiniz
    //      Başka bişeyi değiştirmeye gerek yok.
    final int zamOrani = 20;

    @Override
    public int getZamOrani() {
        return zamOrani;
    }

    @Override
    public String getDepartmanKodu() {
        return departmanKodu;
    }

    @Override
    public String toString() {
        return "InsanKaynaklariDepartmani{" +
                "departmanKodu='" + departmanKodu + '\'' +
                '}';
    }
}
