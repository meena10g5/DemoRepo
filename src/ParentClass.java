
public class ParentClass {

	public  void start()
	{
		System.out.println("Parent class - parent method");
		
	}
	public static void main(String args[])
	{
		ParentClass pc=new ChildClass();
		pc.main(args);
		ChildClass.main(args);
		
	}
}
