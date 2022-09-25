 class p7{
	 
	 /*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
*/

public static void main(String args[]){
	for(int i=1;i<=5;i++) {
			for (int space=4 ; space>=i ; space--)
			System.out.print(" ");
			
	{
		for(int j=1;j<=i*2-1;j++)//space
		{
			
			System.out.print("*");
			 
		}System.out.println();
	}
	}
	for(int i=4;i>=1;i--) {
			for (int space=i-4 ; space<=0 ; space++)
			System.out.print(" ");
			{
				for(int j=i*2-1;j>=1;j--)//space
					{			
						System.out.print("*");
					}			//if(i<5); 
					System.out.println();	
	}
	}
	
} 
}