package AssignmentJavaa;

import java.util.Scanner;

public class WithdrawAmount {
public static void main(String[] args) {
	int a;
	int b=2000;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("your amount is 2000\n enter amount between 2000");
	a=sc.nextInt();
	
	if (a<=b) {
		System.out.println("your amount is withdraw your balance is"+(b-a));
	}else if (a!=b) {
		System.out.println("sorry,insufficient balance,you nedd more" + (a-b) +"Rs to perform this transaction");
	}
}
}
