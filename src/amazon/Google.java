package amazon;

import java.math.BigInteger;
import java.util.Scanner;

public class Google {
	
		private static Scanner s;

		public static void main (String[] args) {
	

			/*	s = new Scanner(System.in);
							int n= Integer.parseInt(s.next());
							BigInteger sol,m,result;
						BigInteger t;	
							//  double result;
							long[][] arr=new long[n][3];
							for(int i=0; i<n;i++)
							{
							    for(int j=0;j<3;j++)
							    {
							    arr[i][j] =Integer.parseInt(s.next());
						    	 if(arr[i][0]==0)
										
								     System.out.println("Chances of Aritmetic exception");
								     
							  }
							}
							/*for(int i=0;i<n;i++) {
							 t=new BigInteger(String.valueOf(arr[i][1]));
							//t=arr[i][1];
							    m=new BigInteger(String.valueOf(arr[i][0]));
					 BigInteger g=new BigInteger(String.valueOf(arr[i][2]));
							    result=m.modPow(t, g);
	System.out.println(result);
							}*/
					
				
				
				
				/*Recursion method*/
			
			/*
	 s = new Scanner(System.in); 
	    int max = Integer.valueOf(s.nextLine());
	    try{
	    while (max > 0 ){
	        int a = 0;
	        int b = 0;
	        int c = 0;
	        String line = s.nextLine();
	        
	       String[] parts = line.trim().split(" ");
	        a = Integer.valueOf(parts[0]);
	        b = Integer.valueOf(parts[1]);
	        c = Integer.valueOf(parts[2]);
	       System.out.println(modulo(a,b,c));
	       --max;
	      
	    }
	    }
	    catch(Exception e){
	        System.out.println("Exception occured" +e);
	    }
	    }
	    
	

	
	public static int modulo(int a, int b, int c){
	   
	  if(b==0)
	  {
	      return 1;
	      
	  }
	
	    else {
	     return (a * modulo(a,(b-1),c))%c;
	    }
	   
	}*/
			
			
			 s=new Scanner(System.in);
	    	int t=s.nextInt();
	    	while(t-->0)
	    	{
	    	    int a=s.nextInt();
	    	    int b=s.nextInt();
	    	    int c=s.nextInt();
	    	    long s=1;
	    	    for(int i=0;i<b;i++)
    		    {
                s=(s*a)%c;    		    }
    		    System.out.println(s);
	    	}
			
			
		}
}