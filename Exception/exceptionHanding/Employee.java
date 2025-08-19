package exceptionHanding;

public class Employee {
	String username ;
	String password;
	public Employee(String username,String password) {
		this.username=username;
		this.password=password;
	}
	public String getusername() {
		return username;
	}
	public String getpassword() {
		return password;
	}
	@Override
    public String toString() {
        return username + " " + password;

     }
}


