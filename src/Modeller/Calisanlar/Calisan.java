package Modeller.Calisanlar;

import Modeller.Departmanlar.Departman;
import Veritabani.Calisanlar;
import Veritabani.Departmanlar;

public class Calisan {

    private String calisanId;
    private String adSoyad;
    private int maas;
    private Departman Departman;
    private String isimKodu = "";

    private static int sayac=158;

    public Calisan(String adSoyad, int maas, String departmanKodu) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        setDepartman(departmanKodu);
        // constructor çalıştığında, aşağıda tanımlayacağınız bu metod vasıtasıyla tekil bi ID alacak...
        // Örn: Şirkette 257 calisan var, Bilişim teklonojileri departmaninda Mehmet Ali Bulut kaydedilecek olsun,
        // Mehmet Ali icin ID 'BTD258MAB' olmalıdır.
        this.setCalisanId(this.adSoyad);
        Calisanlar.addACalisan(this);

    }

    // Terminalden girilen calisanin departman koduna göre, gerekli departman set edilmelidir.
    // Çalışan sınıfının Constructor 'ı main'de tanımlı. Program çalıştığında, terminalden gireceğimiz
    // departman kodu, buradaki metod (setDepartman) vasıtasıyla departman listesinin tümünü dolaşıp (foreach)
    // getDepartmanKodu() ile bulunan sonuçlardan biriyle aynı mı? Diye bakıyoruz...
    // Aynıysa, "terminalden girilen çalışanı bu departmana set et" demektir...
    private void setDepartman(String departman) {
        // TODO setDepartman() methodunu doldurunuz

        //  Terminalden girilen calisanin departman koduna göre, gerekli departman set edilmelidir.
        //  Çalışan sınıfının Constructor 'ı main'de tanımlı. Program çalıştığında, terminalden gireceğimiz
        //  departman kodu, buradaki metod (setDepartman) vasıtasıyla departman listesinin tümünü dolaşıp (foreach)
        //  getDepartmanKodu() ile bulunan sonuçlardan biriyle aynı mı? Diye bakıyoruz...
        //  Aynıysa, "terminalden girilen çalışanı bu departmana set et" demektir...
        //  İpucu: Departman listesinin (Veritabani.Departmanlar.DepartmanList) içerisindeki departmanların kodları var,
        //  bu kodlari donguye tutmak ise yarayabilir.
        boolean varMi=false;

        for (Departman d:Departmanlar.getDepartmanList()){
            if (d.getDepartmanKodu().contains(departman)){
                this.Departman= d;
                System.out.println("Terminalden girilen çalışan " + d.getDepartmanKodu() + " departmanına set edidi");
                varMi=true;
            }
        }
        if (!varMi){
            System.out.println("Terminalden girilen çalışan ilgili departmanına set edilemedi");
        }
    }

    private void setCalisanId(String s) {
        // TODO setCalisanId() methodunu doldurunuz
        // Calisanin ID sinin kendisine özel olduğundan bahsetmistik,
        // ID nin nasil kaydedileceği Readme Dosyasi içerisinde yer aliyor.

        String[] isimler=s.split(" ");
        String basHarfler="";
        for (int i = 0; i < isimler.length; i++) {
            basHarfler+=isimler[i].charAt(0);
        }
        this.calisanId=this.Departman.getDepartmanKodu()+sayac+basHarfler;
        sayac++;

    }

    private String getCalisanIsimKodu() {
        // TODO getCalisanIsimKOdu() methodunu doldurunuz
        // Calisanin ID sinin sonuna isim kodu eklenmesi için, ismi parçalayan bir method
        // Basit string metodlari ise isinize cok yarayacaktir fakat dinamik olmasina dikkat edelim...
        // Mesela 2 isim bir soyisim girildiğinde hata vermesin.

        String[] isimler=this.adSoyad.split(" ");
        String basHarfler="";
        for (int i = 0; i < isimler.length; i++) {
            basHarfler+=isimler[i].charAt(0);
        }

        this.isimKodu=this.calisanId+basHarfler;
        return isimKodu ;// TODO burayi unutmayin
    }



    // Calisanin id sini almak icin basit getter method
    public String getCalisanId() {
        return this.calisanId;
    }

    // Calisanin departmanini almak icin basit getter method
    public Departman getDepartman() {
        return this.Departman;
    }


    // Departman adini verebilmek için bir method
    public String getDepartmanAdi() {

        // TODO getDepartmanAdi() methodunu doldurunuz
        // İpucu: Departman Kodu YD ise departman adi Yonetim Departmani olarak kaydedilmelidir.


        return  String.valueOf(this.Departman) ;// TODO burayi unutmayin
    }

    // Calisana zam yapilmasi için gerekli bir method
        public static void zamYap(String calisanId) {

        // TODO zamYap() methodunu doldurunuz
        // İpucu:Calisan ID si kullanilarak yapilmalidir, diğer attributelarin aynilarindan 1 er tane daha olabilirdi.

            for (Calisan c:Calisanlar.getCalisanList()){
                if (c.getCalisanId().equalsIgnoreCase(calisanId)){
                    c.maas+= c.maas*c.Departman.getZamOrani()/100;
                }
            }

    }

    // Calisanlari yazdırmak için gerekli bir override
    @Override
    public String toString() {

        // TODO toString() metheodunu doldurunuz
        // İpucu: Detayli anlatim EmployeesRequirements.pdf içerisinde.

        return  "Calisan{" +
                "calisanId='" + this.calisanId + '\'' +
                ", adSoyad='" + this.adSoyad + '\'' +
                ", maas=" + this.maas +
                ", Departman=" + this.Departman +
                '}';// TODO burayi unutmayin

    }

}
