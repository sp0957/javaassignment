package AssignmentJavaa;

import java.util.Scanner;

public class ArmstorngNumber {
public static void main(String[] args) {
int no=371,rem,cube,sum=0,val=no;
	
	
	while (no!=0) {
		rem=no%10;
		no=no/10;
		System.out.println("rem  :"+rem);
		cube=(int)Math.pow(rem, 3);
		System.out.println("cube :"+cube);
		sum+=cube;
	}System.out.println(sum);
	
	
	if (val==sum) {
		
		System.out.println("armstorng number.......");
	}else {
		System.out.println("not armstorng number......");
	}	
	
	
	
	
	
		
	
	}
}
