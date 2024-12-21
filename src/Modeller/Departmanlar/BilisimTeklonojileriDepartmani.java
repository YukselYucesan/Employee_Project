package Modeller.Departmanlar;

public class BilisimTeklonojileriDepartmani implements Departman {

    final String departmanKodu = "BTD";

    // TODO Bu class'da sadece zam oranini belirtmelisiniz
    //      Başka bişeyi değiştirmeye gerek yok.
    final int zamOrani = 25;


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
        return "BilisimTeklonojileriDepartmani{" +
                "departmanKodu='" + departmanKodu + '\'' +
                '}';
    }
}
