package Veritabani;

import Modeller.Departmanlar.BilisimTeklonojileriDepartmani;
import Modeller.Departmanlar.Departman;
import Modeller.Departmanlar.InsanKaynaklariDepartmani;
import Modeller.Departmanlar.YonetimDepartmani;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Departmanlar {

    // TODO Bu class'da bir sey degistirmenize gerek yok
    // Bunu bir veritabani gibi düsünmeliyiz bu yüzden proje calistiği zaman, ilk once veritabani olusmali ki
    // ekleme cikarma islemlerini rahatca yapabilelim bu yüzden tüm değerleri static verip, departmanList i ise
    // new leyip, bu departmanlari içerisine bulunduralim.
    static private final Departman BILISIM_TEKLONOJILERI_DEPARTMANI = new BilisimTeklonojileriDepartmani();
    static private final Departman YONETIM_DEPARTMANI = new YonetimDepartmani();
    static private final Departman INSAN_KAYNAKLARI_DEPARTMANI = new InsanKaynaklariDepartmani();
    static private List<Departman> DepartmanList = new ArrayList<>(Arrays.asList(BILISIM_TEKLONOJILERI_DEPARTMANI, YONETIM_DEPARTMANI, INSAN_KAYNAKLARI_DEPARTMANI));

    // getter method
    public static List<Departman> getDepartmanList() {
        return DepartmanList;
    }




}


























