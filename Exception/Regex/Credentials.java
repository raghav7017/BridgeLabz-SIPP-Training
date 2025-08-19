package Regex;

public abstract class Credentials {
    protected String email;
    protected String password;

    public Credentials(String email, String password) {
        this.email = email;
        this.password = password; 
}
    public abstract boolean isValid();

   
    public String getEmail() { 
    	return email; 
    	}
    
    public String getPassword() {
    	return password; 
    	}
    
public class Login extends Credentials {
    public Login(String email, String password) {
        super(email,password);
    }

    @Override
    public boolean isValid() {
        
        return this.email.equals(email) && this.password.equals(password);
    }

   
    public String getEmail() { 
    	return email;
    	}
    }
    public void setEmail(String email) { 
    	this.email = email;
    	}

    public String getpassword() {
    	return password; 
    	}
    public void setPassword(String password) {
    	this.password = password; 
    	}
}

	
	


