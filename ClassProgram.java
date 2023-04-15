package AssignmentJavaa;
abstract class Parentt
    {
	public abstract void message();
    }
class childd1 extends Parentt
    {
		public void message() 
		{
			System.out.println("this is frist subclass");
		}
	}
class childd2 extends Parentt
    {
		public void message() 
		{
			System.out.println("this is secound subclass");
		}
	}

public class ClassProgram {
public static void main(String[] args) {
	childd1 c=new childd1();
	c.message();
	childd2 c1=new childd2();
	c1.message();
	
}
}
