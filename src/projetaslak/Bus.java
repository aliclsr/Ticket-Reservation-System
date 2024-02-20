package projetaslak;


public class Bus extends Vehicle{
    
    public Bus()
    {
        
    }
    
    public Bus(String aracTuru)
    {
        super(aracTuru);
    }
    public Bus(String yakitTuru , int yakilanYakit , int aracID , int kapasite , String aracTuru)
    {
        super(yakitTuru , yakilanYakit , aracID , kapasite , aracTuru);
    }

    @Override
    public double CalculateFuelCost() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
