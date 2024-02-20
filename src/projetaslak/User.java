package projetaslak;


public abstract class User implements ILoginable{
    
    String Username;
    String Password;
    
    public User()
    {
        
    }
    
    public User(String username , String password)
    {
        Username = username;
        Password = password;
    }
    
     
    public String getUsername()
    {
        return Username;
    }
             
    public String getPassword()
    {
        return Password;
    }
    
    
}
