package AssignmentJavaa;

import java.util.Scanner;

public class demonstrateTryCatch {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println("enter the secound number");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		
	} catch (ArithmeticException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	System.out.println("arithmeticException progarm is over");
	
	
	
	try {
		int []x =new int [2];
		for (int i = 0; i <3; i++) {
			x[i]=i+1;
			System.out.println(x[i]);
		}
	} catch (ArrayIndexOutOfBoundsException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	System.out.println("arrayIndexOutOfBoundsException progarm is over");

	
}
}
