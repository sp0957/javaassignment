package AssignmentJavaa;


public class Patten2 {
public static void main(String[] args) {
	/*
	 * 1
	 * 22
	 * 333
	 * 4444
	 * 55555
	 */
	/*for (int i = 1; i<=5; i++) {
		for (int j=1; j<=i; j++) {
			System.out.print(i);
			
		}System.out.println( );
	}*/
	
	
	
	/*
	 * 5
	 * 54
	 * 543
	 * 5432
	 * 54321
	 */
	for (int i = 5; i >=1; i--) {
		for (int j = 5; j>=i; j--) {
			System.out.print(j);
		}System.out.println(" ");
	}
	
	/*
	 * ****
	 * ***
	 * **
	 * *
	 */
	for (int i= 1; i<=5; i++) {
		for (int j = 4; j>=i; j--) {
			System.out.print("*");
		}System.out.println();
	}
	
	/*
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * ****
	 * ***
	 * **
	 * *
	 */
	for (int i = 1; i <=5; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}System.out.println(" ");
		
	}for (int k = 1; k<=4; k++) {
		for (int s = 4; s>=k; s--) {
			System.out.print("*");
		}System.out.println(" ");
	}
	
	
	/*
	 *  *****
	 *  *   *
	 *  *   *
	 *  *****
	 */
	
	 int i=4;
	int j=5;
	for ( i = 1; i <=4; i++) {
		for ( j =1; j <=5; j++) {
			if (i==1 || j==1 || i==4 || j==5 ){
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}System.out.println(" ");
		
	}
	
	
	/* 0
	 * 10
	 * 010
	 * 1010       (if you want right angle then add for loop for space )
	 * 01010
	 * 101010
	 */
	for (int j2 = 0; j2 <=5; j2++) 
	{
		int num;
		if (j2%2==0)
		{
			num=0;
			System.out.print(num);
		}
		else 
		{
			num=1;
			System.out.print(num);
		}
		for (int k = 1; k <=j2; k++) 
	{
			if (num==1)
			{
				num=0;
			}else 
			{
				num=1;
			}
		System.out.print(num);	
		}System.out.println();
	}
	
	
}         
}
