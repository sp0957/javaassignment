package AssignmentJavaa;

import java.util.Scanner;

public class Marks{
public static void main(String[] args) {
	int a;
	Scanner  sc=new Scanner(System.in);
	System.out.println("enter marks(out of 100)");
	a=sc.nextInt();
	if (a>=91 &&a<=100) {
		System.out.println("your grade is : AA");
	} 
	else if (a>=81 && a<=90) {
		System.out.println("your grade is :AB");
	}
	else if (a>=71 && a<=80) {
		System.out.println("your grade is :BB");
	}
	else if (a>=61 && a<=70) {
		System.out.println("your grade is :BC");
	}
	else if (a>=51 && a<=60) {
		System.out.println("your grade is :CD");
	}
	else if (a>=41 && a<=50) {
		System.out.println("your grade is :DD");
	}
	else if (a<=40) {
		System.out.println("sorry! you are Fail ");
	}else {
		System.out.print("enter between  out of 100");
	}
}
}
