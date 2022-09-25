import java.util.*;
class p4{
public static void main(String args[]){

/*
output
                  9
                8 9 8
              7 8 9 8 7
            6 7 8 9 8 7 6
          5 6 7 8 9 8 7 6 5
        4 5 6 7 8 9 8 7 6 5 4
      3 4 5 6 7 8 9 8 7 6 5 4 3
    2 3 4 5 6 7 8 9 8 7 6 5 4 3 2
  1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
*/  
   

/*
int i,j;
for(i=9; i>=1; i-- ){
 for(j=1; j<=i*2; j++){
 System.out.print(" ");
 }
 for(j=i; j<=9; j++){
 System.out.print(j+" ");
 }
for(j=9-1; j>=i; j--){
 System.out.print(j+" "); 
 }
  System.out.println();
              
}*/
Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Size of Array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int zero=0, mul=1;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]==0)	zero++;
			else	mul*=arr[i];	
		}
		if(zero>1){
			for(int i=0;i<n;i++)
			{
				arr[i]=0;
				System.out.print(arr[i]+" ");
			}	
		}else{
			for(int i=0;i<n;i++)
				if(arr[i]==0){
					arr[i]=mul;
					System.out.print(arr[i]+" ");
				}else{
					arr[i]=mul/arr[i];
					System.out.print(arr[i]+" ");		
			}	
		}	

}

}		  
		  
		  

	



