/*
Write a Java program to find the k largest elements in a given array. Elements in the array 
can be in any order (Use scanner class to input and Array, below picture is example do not 
make static array as repsrented in example).
*/
import java.util.*;

class LargeNo{

	public static void main(String args[]){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter no of nos you want :");
	int n= sc.nextInt();
	
	int a[] = new int[n];
	
	for(int i=0; i < a.length; i++){
	
		 a[i]= sc.nextInt();
	}
	
	bsort(a);
	System.out.println("----------------------------------------");
	System.out.println("how much nos you want :");
	int n1= sc.nextInt();
	for(int i=n-1; i > 0; i--){
		if(n1>i)
		 System.out.println(a[i]);
	}
	
	
	/*int no=0;
	
	int[] newa = new int[n];
	for(int i=0; i < a.length; i++){
		if(i<a.length-1){
			if(a[i]<a[i+1]){
				newa[i]=a[i+1];
				
			}
		}
	}
	System.out.println("Largest element in Array is :  "+no);

	for(int i=0; i < a.length; i++){
	
		 System.out.println(a[i]);
	}*/
	
	
	
	
	
	
	
	
	}
	
	static void bsort(int a1[])
		{
			int n = a1.length;
			for(int i=0; i<n-1; i++) //passes
			{
				//for(int j=0; j<n-1; j++)   //normal way
				for(int j=0; j<n-i-1; j++)  //internal iteration
				{			  //we can skip lower triangle iteration due to n-i condition 
					if( a1[j] > a1[j+1] )
					{
						int temp = a1[j];
						a1[j] = a1[j+1];
						a1[j+1] = temp;
					
					}
				}	
			}
		}
		static void display (int a1[])
		{
			int n=a1.length;
			for(int i=n; i>0; i--)
			{
				System.out.print(a1[i]+", ");
			}
		
		}
}