 class p9{
	 
	 /*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
*/

public static void main(String args[]){
	for(int i=1;i<=5;i++) {
		for (int space=4 ; space>=i ; space--)
		System.out.print(" ");
	{
		for(int j=1;j<=i;j++)//space
		{
			System.out.print("*"); 
		}
	}
	
		System.out.println();
	}
	for(int i=4;i>=1;i--) {
		for (int space=i-3 ; space<=1 ; space++)
		System.out.print(" ");
	{
		for(int j=1;j<=i;j++)//space
		{	
			System.out.print("*");	 
		}
	}
		System.out.println();
	}
	
	
	
	
} 
}