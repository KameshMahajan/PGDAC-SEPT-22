
import java.util.Scanner;
class p10n{

public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter no=");
	int n= sc.nextInt();
	
	for(int i=n; i>=0 ; i--)
	{
		for(int j=0; j<i; j++){
			System.out.print(" ");
		}
		
		for(int j='A'+i ;j<='A'+n ; j++){
			System.out.print((char)j+" ");
		}
		System.out.println();
	}		
}
}
Scanner sc = new Scanner
/*
D:\CDAC\day 11>javac p1.java

D:\CDAC\day 11>java p1
Enter no=
8
        I
       H I
      G H I
     F G H I
    E F G H I
   D E F G H I
  C D E F G H I
 B C D E F G H I
A B C D E F G H I
*/

