package AssignmentJavaa;
class Threadrunnable1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int x=0;
		while (x<=5) {
		System.out.println("Threadrunnable 1 is runnig.."+x);	
		x++;
		}
	}
}
class Threadrunnable2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int x=0;
		while (x<=5) {
			System.out.println("Threadrunnable 2 is runnig.."+x);
			x++;
		}
		
	}
	
}
public class ThreadRunnableInterface {
public static void main(String[] args) {
	Threadrunnable1 bullet=new Threadrunnable1();
	Thread gun =new Thread(bullet);
	
	Threadrunnable2 bullet2=new Threadrunnable2();
	Thread gun2 =new Thread(bullet2);
	gun.start();
	gun2.start();
	System.out.println(gun.getId());
	
	
}
}
