 class p4{
	 
	 /*
*****
 ****
  ***
   **
    *
*/

public static void main(String args[]){
		
	
	for(int i=1;i<=5;i++) {
			for (int space=1 ; space<=i-1 ; space++)
			System.out.print(" ");
			
	{
		for(int j=5;j>=i;j--)//space
		{
			
			System.out.print("*");
			 
		}
	}
	
		/*for(int j=1;j<=i;j++)//col
		{
			System.out.print(j );
			
		}
		*/
		System.out.println();
	}
	
	
	
	
} 
}