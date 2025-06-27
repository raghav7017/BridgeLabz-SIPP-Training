package ArraysProblems;

import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<1) {
			System.out.println("error");
		}
		int[] odd = new int[(n+1)/2];
		int[] even = new int[(n+1)/2];
		int idxO = 0, idxE = 0;
		
		for(int i=1;i<=n;i++) {
			if(i%2 == 0) {
				even[idxE++] = i;
			}
			
			else {
				odd[idxO++] = i;
			}
		}
		
		for(int i=0;i<idxO;i++) {
			System.out.print(odd[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0;i<idxE;i++) {
			System.out.print(even[i] + " ");
		}
		
		sc.close();
	}

}
