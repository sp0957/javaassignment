package AssignmentJavaa;
import java.util.Scanner;

public class AllArrayQuestion {
public static void main(String[] args) {
	
         // min number 
	/*int m =Integer.MIN_VALUE;
	
	int []value= {23,43,54,56,78,99,78};
	
	for (int i = 0; i < value.length; i++) {
		if (value[i]>m) {
			m=value[i];
		}
	}System.out.println("min value is"+m);
	
	
   int m1=Integer.MIN_VALUE;
	
	for (int i = 0; i < 5; i++) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int[] value1=new int[5];
		value1[i]= sc.nextInt();
	
		if (value1[i]>m1) {
			m1=value1[i];
		}
	}System.out.println("your min number is.."+m1);*/
	
	
	
	    // MAX_VALUE
  /*int m =Integer.MAX_VALUE;
	
	int []value= {23,43,54,56,78,99,78};
	
	for (int i = 0; i < value.length; i++) {
		if (value[i]<m) {
			m=value[i];
		}
	}System.out.println("mix value is"+m);
	
	
	int s =Integer.MAX_VALUE;
	for (int i = 0; i <4; i++) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		
		int []a=new int[4];
		a[i]=sc.nextInt();
		if (a[i]<s) {
			s=a[i];
			
		}
	}System.out.println("your max number is.."+s);*/
	
	
	  //avg
	/*float []s ={122.7f,434.88f,343.8f,443.88f,332.8f,322.8f,222.9f};
	float sum,avg;
	sum=0;
	for (int  i = 0; i <s.length; i++) {
		sum +=s[i];
	}avg=sum/s.length;
	System.out.println("avg is.."+avg);
	
	
	
	int [] x=new int [3];
	int sum1 =0;
	int avee;
	for (int i = 0; i <x.length; i++) {
		System.out.println("enter number"+(i+1));
	Scanner  sc=new Scanner(System.in);
     x[i]=sc.nextInt();
	    sum1 += x[i];
	}avee=sum1/x.length;
	System.out.println("your ave is .."+avee);*/
	
	
	
	
	  //length
	/*int[]a= {38,39,48,54,44,43};
	System.out.println(a.length);
	
	int []y = new int[8];
	for (int i = 0; i<y.length; i++) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);	
		y[i]=sc.nextInt();
	}System.out.println("your lenth is......"+y.length);*/
	
	
	//reverse
	
	/*int a[]=new int [7];
	for (int j = 6; j>0; j--) {
		a[j]=j;
		System.out.println("reverse array of integer" +a[j]);
	}*/
	
	
	/*int b[]=new int[4];

	for (int i=0; i<b.length; i++) 
	{
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		b[i]=sc.nextInt();
	}
	System.out.println("reverse no");
	for (int i =b.length-1; i >=0; i--) 
	{
		System.out.println(b[i]);
	}*/
	
	
	
	// copy one array into other array
	/*int x[]= {43,43,465};
	
	int y[]=new int[x.length];
     for (int i = 0; i < x.length; i++) 
     {
		y[i]=x[i];
	 }
     System.out.println("original array");
     for (int i = 0; i < x.length; i++)
     {
		System.out.println(x[i]);
	 }
     System.out.println("copy of x array");
     for (int i = 0; i < y.length; i++) 
     {
		System.out.println(y[i]);
	 }*/
     
     
	int a[]=new int[3];
    int b[]=new int[a.length];
        System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		
     for (int i = 0; i < a.length; i++) 
     { 
    	 a[i]=sc.nextInt();
	 }
//     System.out.println("original array");
//     for (int i = 0; i < a.length; i++) 
//     {
//		System.out.println(a[i]);
//	 }
     System.out.println("copy array");
     for (int i = 0; i < b.length; i++) 
     {
    	 b[i]=a[i];
		System.out.println(b[i]);
	 }
     
     
     
     
     
     
}
}
