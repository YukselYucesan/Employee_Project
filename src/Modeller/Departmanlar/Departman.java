package Modeller.Departmanlar;

public interface Departman {

    // TODO Bu Class'da bir degisiklik yapmayiniz
    /*
       İpucu : Departman üzerinden bu methodlar kullanilacak fakat, calisanin departmani hangisi ise
       onun özellikleri gecerli olacak. Bu bize daha dinamik bir yapi sağlar.
     */

    // Calisan sinifinin zamYap() metodunda kullanılacak
    int getZamOrani();

    // Calisan sınıfında kullanılacak
    String getDepartmanKodu();

}
