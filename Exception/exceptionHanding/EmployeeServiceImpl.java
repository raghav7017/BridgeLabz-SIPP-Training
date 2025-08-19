package exceptionHanding;
import java.util.Scanner;
import java.util.*;
public class EmployeeServiceImpl implements IEmployee{
	 private List<Employee> employees;

	    public EmployeeServiceImpl() {
	        employees = new ArrayList<>();
	        employees.add(new Employee("admin", "admin123"));
	        employees.add(new Employee("john", "john123"));
	        employees.add(new Employee("alice", "alice123"));
	    }
	@Override
	public String login(String username, String password) throws usernotfoundException {
		for (Employee emp : employees) {
            if (emp.getusername().equals(username)) {
                if (emp.getpassword().equals(password)) {
                    return "Login successful for user: " + username;
                } else {
                    throw new usernotfoundException("Invalid password.");
                }
            }
        }
        throw new usernotfoundException("Username does not exist.");
    }

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();
        EmployeeServiceImpl service = new EmployeeServiceImpl();
        sc.close();
        try {
            String result = service.login(username, password);
            System.out.println(result);
        } catch (usernotfoundException e) {
            System.out.println("Login Failed: " + e.getMessage());
    }
  }
}