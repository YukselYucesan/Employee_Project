package Veritabani;

import Modeller.Calisanlar.Calisan;
import java.util.ArrayList;
import java.util.Iterator;

public class Calisanlar {


    // Buradaki calisanList static cünkü proje calismaya basladiği anda oluşması lazım.
    // Bunu bir veritabani gibi görebiliriz. Calisanlarimizin hepsi bu liste icerisinde yer alacak.
    private static ArrayList<Calisan> calisanList = new ArrayList<>();

    // // Tüm çalışanları almak için
    public static ArrayList<Calisan> getCalisanList() {
        return calisanList;
    }


    public static void addACalisan(Calisan calisan) {

        // TODO Bir çalışan eklemek için gerekli method. addACalisan() methodunu doldurunuz
        calisanList.add(calisan);

    }


    public static void deleteACalisanWithId(String calisanId) {

        // TODO Bir çalışan silmek için gerekli method. deleteACalisanWithId() methodunu doldurunuz

        Iterator iterator=calisanList.iterator();

        while (iterator.hasNext())  // sırada eleman var mı ?
        {
            Calisan c= (Calisan) iterator;
            if (c.getCalisanId().equalsIgnoreCase(calisanId)){
                calisanList.remove(iterator);
            }
        }

    }


    public static void printDepartmandakiCalisanlar(String departmanKodu) {

        // TODO  Departman kodu verilerek, konsola sadece o departmanda calisanlari yazdirmak için
        //       printDepartmandakiCalisanlar() methodunu doldurunuz

        for (Calisan c:calisanList){
            if (c.getDepartman().getDepartmanKodu().equalsIgnoreCase(departmanKodu)) {
                System.out.println(c);
            }
        }

    }


    public static void printCalisanlar() {

        // TODO  Calisanlari konsola yazdirmak için printCalisanlar() methodunu doldurun

        for (Calisan c:calisanList){
            System.out.println(c);
        }

    }
}
