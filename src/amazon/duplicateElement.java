package amazon;

import java.util.HashSet;
import java.util.Set;

public class duplicateElement {
	 public static void duplicateElement(int arr[]){
		 Set<Integer> hs=new HashSet<Integer>();

		 for(Integer name: arr)
		 {
		     if(hs.add(name)==false){
System.out.println("duplicate element is" +name)		   ;
}	    
		 }
		    }
		      public static void main(String []args){

		 int a[]={1,1,3,4,5};
			System.out.println("********************");

		duplicateElement(a);
		      }
	

}
