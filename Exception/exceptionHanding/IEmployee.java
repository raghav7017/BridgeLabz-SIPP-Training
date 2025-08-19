package exceptionHanding;

public interface IEmployee {
    String login(String username, String password) throws usernotfoundException;
    
}


