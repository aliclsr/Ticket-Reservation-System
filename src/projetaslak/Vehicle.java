package projetaslak;

import java.util.ArrayList;


public abstract class Vehicle {
    
    //private int personelSayisi;
    //private int kullananPersonelMaas;
    //private int hizmetPersonelMaas;
    
    private String yakitTuru;
    private int yakilanYakit;
    private int aracID;
    private int kapasite;
    private String aracTuru;
    
    public Vehicle()
    {
        
    }
    public Vehicle(String aracTuru)
    {
        this.aracTuru = aracTuru; 
    }
    public Vehicle(String yakitTuru , int yakilanYakit , int aracID , int kapasite , String aracTuru)
    {
        this.yakitTuru = yakitTuru;
        this.yakilanYakit = yakilanYakit;
        this.aracID = aracID;
        this.kapasite = kapasite;
        this.aracTuru = aracTuru;
    }
    
    public String getAracTuru()
    {
        return aracTuru;
    }
    
    
    public abstract double CalculateFuelCost();
    

        
}
