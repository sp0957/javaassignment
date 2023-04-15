package AssignmentJavaa;

import java.util.Scanner;


public class FibonacciSeries {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int c;
	System.out.println(a);
	System.out.println(b);
	for (int i=0; i<5; i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		
	}
	
	
System.out.println("enter number");	
Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=0;
	int z=1;
	int s;
	
	if (x>44) {
		System.out.println("enter valid number");
	}else {
		//System.out.println(y);
		//System.out.println(z);
		for (int  i = 0; i <x; i++) {
			s=y+z;
			y=z;
			z=s;
			System.out.println(s);
		}
		
	}    	
	
}
}
