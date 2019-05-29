
public class ChildClass extends ParentClass{

	public final void start()
	{
		System.out.println("Child class - start method");
		super.start();
	}
	public static  void stop() {
		System.out.println("child class - stop");
	}
	
	public static void main(String args[]) {
		ParentClass pc=new ChildClass();
		pc.start();
		
	}
}
