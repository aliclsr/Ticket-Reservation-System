package projetaslak;


public class Airplane extends Vehicle{
    
    public Airplane()
    {
        
    }

    public Airplane(String aracTuru)
    {
        super(aracTuru);
    }
    public Airplane(String yakitTuru , int yakilanYakit , int aracID , int kapasite , String aracTuru)
    {
        super(yakitTuru , yakilanYakit , aracID , kapasite , aracTuru);
    }

    @Override
    public double CalculateFuelCost() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
