package AssignmentJavaa;


import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	int no=97, flag=1;
	
	for (int i = 2; i <no; i++) {
		if (no%i==0) {
			flag=0;
		}
	}if (flag==1) {
		System.out.println("prime number");
	}else {
		System.out.println(" not a prime number ");
	}
	
	
	
	
	
	/*System.out.println(" enter number ..");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int flag=1;
	for (int i = 2; i<a; i++) {
		
		if (a%i==0) {
			flag=0;
		}
		
	}if (flag==1) {
		System.out.println(" prime number");
	}else {
		System.out.println(" not a prime number");
	}*/

	
}
}
