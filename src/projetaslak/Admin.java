package projetaslak;

import java.util.ArrayList;


public class Admin extends User{
    
    private ArrayList<Company> sirketListe = new ArrayList<Company>();
    
    public static int hizmetParasi = 1000; 
    
    public Admin(String username , String password)
    {
        super(username , password);
    }

    public static int getHizmetParasi() {
        return hizmetParasi;
    }
    public static void setHizmetParasi(int hizmetParasi) {
        Admin.hizmetParasi = hizmetParasi;
    }
    

    public void addToArrayList(Company yeniSirket)
    {
        sirketListe.add(yeniSirket);
    }
    public void removeFromArrayList(int index)
    {
        sirketListe.remove(index);
    }
    public ArrayList<Company> getCompanyList()
    {
        return sirketListe;
    }
    
    
    public Company getElement(int i)
    {
        return sirketListe.get(i);
    }
    
}
