
public class Finalize {

public void finalize()
{
	System.out.println("finalize");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method -1");
	}
public static void main(int n) {
	System.out.println("main method -2");

}
public static void main(String args) {
	System.out.println("main method -3");

}
}
