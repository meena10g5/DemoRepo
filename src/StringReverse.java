
public class StringReverse {

	public static String stringrev(String str) {
		
		String rev= "" ;
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev =rev+str.charAt(i);
			}
return rev;	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

String st=	stringrev("abscdcd");
	System.out.println(st);
	System.out.println("Using string buffer");
	String s="absc";
	StringBuffer sb=new StringBuffer(s);
	sb.reverse();
	System.out.println(sb);
	}

}
