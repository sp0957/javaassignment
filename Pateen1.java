package AssignmentJavaa;

public class Pateen1 {
	public static void main(String[] args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 */
		
		/*for (int i = 1; i<=4; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j);
			
		}System.out.println();
	}*/
		
	/*
	 * sum of 1 to 10
	 */		
		/*int sum=0;
		int j;
		for (j = 1; j <=10; j++) {
			System.out.println(j+1);
			sum=sum+j;
			
		}System.out.println(sum);*/
		
		 /*4321
		 * 432
		 * 43
		 * 4
		 */
		/*for (int i = 1; i<=4; i++) {
			for (int j = 4; j>=i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		/*
		 * 1234
		 * 123
		 * 12
		 * 1
		 */
		
		/*for (int i =4; i>=1; i--) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j);
			}System.out.println(" ");
		}*/
		
		/*
		 * 5
		 * 45
		 * 345
		 * 2345
		 * 12345
		 *
		 */
		/*for (int i = 5; i>=1; i--) {
			for (int j =i; j<=5; j++) {
				System.out.print(j);
			}System.out.println(" ");
		}*/
		
		
		/*
		 *     1
		 *    12
		 *   123
		 *  1234
		 * 12345     
		 */
		
		/*for (int i =1; i<=5; i++) {
			for (int j =i; j<=5; j++) {
				System.out.print(" ");}
			for (int k =1; k<=i; k++) {
				System.out.print(k);
			}System.out.println();
		}*/
		
		/*
		 * abcde
		 * bcde
		 * cde
		 * de
		 * e
		 */
		/*for (int i = 'a'; i<='e'; i++) {
			for (int j1 ='i'; j1<='e'; j1++) {
				System.out.print(" ");
			}
			for (int j =i; j <='e'; j++) {
				System.out.print((char)j);
			}System.out.println();
		}*/
		
		
		
		/*
		 *     5
		 *    45
		 *   345
		 *  2345
		 * 12345
		 */
		/*for (int i = 5; i>=1; i--) {
			for (int j1 =i; j1>=1; j1--) {
				System.out.print(" ");
			}
			for (int j = i; j<=5; j++) {
				System.out.print(j);
			}System.out.println();
		}*/
		
		
		
		/*
		 * 1
		 * 10
		 * 101
		 * 1010
		 * 10101
		 */
		for (int j2 = 1; j2 <=5; j2++) {
			for (int k = 1; k <=j2; k++) {
				System.out.print(k%2);
			}System.out.println();
		}
		
		
		/*
		 *           10
		 *          010
		 *         1010
		 *        01010
		 *       101010
		 */
		
		for (int i = 1; i <=7; i++) {
			for (int j = i; j <=7; j++) {
				System.out.print(" ");
			}
			int num;
			if (i%2==0) {
				num=0;
				System.out.print(num);
			}else {
				num=1;
				System.out.print(num);
			}for (int j = 1; j <=i; j++) {
				if (num==1) {
					num=0;
				}else {
					num=1;
				}System.out.print(num);
				
			}System.out.println();
		}
	}

}
