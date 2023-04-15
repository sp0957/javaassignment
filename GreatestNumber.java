package AssignmentJavaa;

import java.util.Scanner;

public class GreatestNumber {
public static void main(String[] args) {
	System.out.println("enter frist number");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("enter secound number");
	int b=sc.nextInt();
	System.out.println("enter last number");
	int c =sc.nextInt();
	
	if (a>b && a>c) {
		System.out.println("frist number is greatest number!!!!!");
		
	}else if (b>c && b>a) {
		System.out.println("secound number is greatest number!!");
		
	} else {
		System.out.println("last number is greatest number!!!!");
	}
	
	
	int  x=23;
	int y=4;
	int z=3;
	 if (x>y && x>z) {
		 System.out.println("x is greatest number");
		
	}else if (y>x && y>z) {
		System.out.println("y is greatest number");
		
	}else {
		System.out.println("z is greatest number");
	}
}
}
