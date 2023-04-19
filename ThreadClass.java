package AssignmentJavaa;
class Thread1 extends Thread{
	public void run() {
		int i=0;
		while (i<=4) {
		System.out.println("this is frist thread class..."+i);	
		i++;
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		int i=0;
		while (i<=4) {
		System.out.println("this is secound thread class..."+i);	
		i++;
		}
	}
}
public class ThreadClass {
public static void main(String[] args) {
	Thread1 t1=new Thread1();
	Thread2 t2=new Thread2();
	t1.start();
	t2.start();
}
}
