package projetaslak;

//arge olarak bakabilirsin
//camel casing  code standart
//pascal casing code standart


//degisken isimleri turkce karakter olmasın
public class Passenger extends Person{
    
    //Person class'ından gelen ad soyad bilgileri zaten vardır.
    
    private static int yolcuSayisi; //static olup olmayacağından ya da böyle bir değişken gerekli olup olmadığından emin değilim
    private long TCKNO;
    private String dogumTarihi;

    public Passenger(String ad, String soyad) {
        super(ad, soyad);
    }

    @Override
    void bilgiYazdir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
