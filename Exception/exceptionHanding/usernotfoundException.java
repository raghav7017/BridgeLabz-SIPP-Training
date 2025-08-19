package exceptionHanding;

public class usernotfoundException extends Exception {
	private String message;
	
    public usernotfoundException(String message){
    	super(message);
    	this.message=message;
		
	}
    @Override
    public String getMessage() {
    	return message;
    }
}
