package projetaslak;

import java.util.ArrayList;

public class Company extends User implements IProfitable ,ILoginable {

    private String name;
    private int KullananUcretler;
    private int HizmetUcretleri;
    private int kazanilan;
    private int harcanan;
    private int kar;
    private static ArrayList<Trip> seferListe = new ArrayList<>();
    private static ArrayList<Vehicle> aracListe = new ArrayList<>();



    public Company()
    {

    }
    public Company(String username , String password , String name)
    {
        super(username , password);
        this.name = name;
    }
    public int getKullananUcretler() {
        return KullananUcretler;
    }

    public void setKullananUcretler(int kullananUcretler) {
        KullananUcretler = kullananUcretler;
    }

    public int getHizmetUcretleri() {
        return HizmetUcretleri;
    }

    public void setHizmetUcretleri(int hizmetUcretleri) {
        HizmetUcretleri = hizmetUcretleri;
    }

    public String getName()
    {
        return name;
    }

    public String getUsername()
    {
        return Username;
    }

    public String getPassword()
    {
        return Password;
    }

    //Araç ekleme-çıakrma fonksiyonları
    public ArrayList<Vehicle> aracListe()
    {
        return aracListe;
    }
    public void addToVehicle(Vehicle yeniArac)
    {
        aracListe.add(yeniArac);
    }
    public void removeFromVehicle(int index)
    {
        aracListe.remove(index);
    }
    //public Vehicle getArac(int i)
    //{
    //    return aracListe.get(i);
    //}



    //Sefer ekleme-çıkarma için fonksiyonlar
    public ArrayList<Trip> seferListe()
    {
        return seferListe;
    }
    public void addToSefer(Trip yeniSefer)
    {
        seferListe.add(yeniSefer);
    }
    public void removeFromSefer(int index)
    {
        seferListe.remove(index);
    }


}
