package projetaslak;

public class Personel extends Person {

    // Person class'ından gelen ad soyad bilgileri zaten var.
    private int maas;
    private String hizmetTürü;

    public Personel(String ad, String soyad) {
        super(ad, soyad);
    }

    @Override
    void bilgiYazdir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
