package Modeller.Departmanlar;

public class YonetimDepartmani implements Departman {

    final String departmanKodu = "YD";

    // TODO Bu class'da sadece zam oranini belirtmelisiniz
    //      Başka bişeyi değiştirmeye gerek yok.
    final int zamOrani = 30;

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
        return "YonetimDepartmani{" +
                "departmanKodu='" + departmanKodu + '\'' +
                '}';
    }
}
