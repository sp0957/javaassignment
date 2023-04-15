package AssignmentJavaa;

import java.util.Scanner;

public class Pateen3 {
	public static void main(String[] args) {
		/*
		 *       1
		 *      1 2
		 *     1 2 3
		 *    1 2 3 4
		 *   1 2 3 4 5
		 */
	for (int i =1; i<=5; i++) {
		for (int j =i; j<=5; j++) {
			System.out.print(" ");}
		for (int k =1; k<=i; k++) {
			System.out.print(k+ " ");
		}System.out.println();
	}
	
	
	/*
    
   * * * 
  
 * * * * * 
  
   * * * 
    
     * 

	 */
	
	for (int i =1; i<=5; i++) {
		for (int j =i; j<=5; j++) {
			System.out.print(" ");
		}
		for (int k =1; k<=i; k++) {
			if (i%2!=0) {
				System.out.print("* ");	
			}
			
		}System.out.println();
		
		}
	for (int i =4; i>=1; i--) {
		for (int j =5; j>=i; j--) {
			System.out.print(" ");
		}
		for (int k =1; k<=i; k++) {
			if (i%2!=0) {
				System.out.print("* " );	
			}
			
		}System.out.println();
		
	}
	
	
	
	/*
	
	 1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
1 5 10 10 5 1 

	 */
	
	
	int num;
	
	for (int i = 0; i <=5; i++) {
		for (int k =5; k>i; k--) {
			System.out.print(" ");
		}num=1;
		for ( int j = 0; j <=i; j++) {
			System.out.print(num + " ");
			num=num*(i-j)/(j+1);
		}System.out.println();
	}
	
	
	
	System.out.println();
	System.out.println();
	
	
	
	
	
	/*Scanner sc=new Scanner(System.in);
	System.out.print(" enter number");
	 int a=sc.nextInt();
	for (int i = 0; i <=a; i++) {
		for (int k =a; k>i; k--) {
			System.out.print(" ");
		}num=1;
		for (int j = 0; j <=i; j++) {
			System.out.print(num + " ");
			num=num*(i-j)/(j+1);
		}System.out.println();
	}*/
	
}
}