 class p5{
	 
	 /*
    *
   ***
  *****
 *******
*********
*/

public static void main(String args[]){
		
	
	for(int i=1;i<=5;i++) {
			for (int space=4 ; space>=i ; space--)
			System.out.print(" ");
			
	{
		for(int j=1;j<=i*2-1;j++)//space
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