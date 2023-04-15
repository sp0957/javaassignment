package AssignmentJavaa;
import java.util.Scanner;

public class FactoialNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number ");
	int n=sc.nextInt();
	int fact=1;
	for (int i=1; i<=n; i++) {
		   fact=fact*i;
	}System.out.println(fact);
	
	/*int fact=1; 
	int n=6;
	for (int i= 1; i<=n; i++) {
		
       fact = fact*i;
		
	}
		
	System.out.println(fact);*/
}
}
