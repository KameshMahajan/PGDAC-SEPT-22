class p13{
	/*

    A
   B B
  C C C
 D D D D
E E E E E

*/
	public static void main(String[] args){
	char c ='A';
		for(int i=1;i<=5;i++){
			for(int k=5;k>i;k--)
				System.out.print(" ");
		//a='E';
				
			for(int j=1;j<=i;j++) {
				
				System.out.print(c +" ");
						
					
			}
			c++;
			System.out.println();
			
		}
		
	}
	
	
	
	
}