package projetaslak;


public class Train extends Vehicle{
    
    public Train()
    {
        
    }

    public Train(String aracTuru)
    {
        super(aracTuru);
    }
    
    public Train(String yakitTuru , int yakilanYakit , int aracID , int kapasite , String aracTuru)
    {
        super(yakitTuru , yakilanYakit , aracID , kapasite , aracTuru);
    }

    @Override
    public double CalculateFuelCost() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


//mustafa.calisir@gmail.com

