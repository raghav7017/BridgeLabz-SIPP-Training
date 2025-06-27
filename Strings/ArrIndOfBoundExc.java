
package Strings;
import java.util.Scanner;
public class ArrIndOfBoundExc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] names = new String[n];
		for(int i=0; i<n; i++) {
			names[i] = sc.nextLine();
			sc.close();
		}
				
		handleException(names);
	}
	public static void generateException(String[] names) {
		System.out.println(names[names.length]);
	}
	public static void handleException(String[] names) {
		try {
			System.out.println(names[names.length]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Caught index out of bound Exception: "+ e);
		}catch(RuntimeException e) {
			System.out.println("Caught Runtime Exception: "+e);
		}
	
	}
}