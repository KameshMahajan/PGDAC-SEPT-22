class p9{
	/*

     A
    A B
   A B C
  A B C D
 A B C D E

*/
	public static void main(String []args){
		char c='A';
		for(int i=1;i<=5;i++){
			for(int k=5; k>i;k--)
				System.out.print(" ");
				c='A';
			for(int j=1;j<=i;j++) {
				System.out.print(c++ +" ");
					
					
			}
			
			System.out.println();
			
		}
		
	}
	
	
	
	
}