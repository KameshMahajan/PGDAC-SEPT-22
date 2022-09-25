 class p5{
	 
	 /*
A
B B
C C C
D D D D
E E E E E



	
	 */

public static void main(String args[]){
		char c = 'A';
	
	for(int i=1;i<=5;i++)//rows
	
	{
		for(int j=1;j<=i;j++)//space
		{
			
			System.out.print(c +" ");
			
		}
		c++;
		/*for(int j=1;j<=i;j++)//col
		{
			System.out.print(j );
			
		}
		*/
		System.out.println();
	}
	
	
	
	
} 
}