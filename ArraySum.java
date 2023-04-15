package AssignmentJavaa;

import java.util.Scanner;

public class ArraySum {
public static void main(String[] args) {
	int[][]x=new int[1][1];
	int[][]y=new int[1][1];
	int[][]z=new int[1][1];
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number x");
    for (int i = 0; i <1; i++) {
		for (int j = 0; j <1; j++) {
			x[i][j]=sc.nextInt();
			//System.out.print(x[i][j]);
		}
	}
    System.out.println("enter number y");
    for (int i = 0; i <1; i++) {
		for (int j = 0; j <1; j++) {
			y[i][j]=sc.nextInt();
			//System.out.println(y[i][j]);
		}
	}
    System.out.println("sum is ..");
    for (int i = 0; i <1; i++) {
		for (int j = 0; j <1; j++) {
			z[i][j]=x[i][j]+y[i][j];
			System.out.println(z[i][j]);
			
		}
	}
	
}
}
