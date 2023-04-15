package AssignmentJavaa;

public class StringQuestion {
public static void main(String[] args) {
	//concatenate a giving string to the end of another string 
	String s1=new String("hello");
	String s2=new String("Tester how are you!!");
	
	System.out.println(s1.concat(s2));
	
	
	// Compare two string 
	if (s1.compareTo(s2)==0) {
		System.out.println("both sting are same");
	}else {
		System.out.println("both are string are diffrent");
	}
	System.out.println(s1.compareTo(s2));
}
}
