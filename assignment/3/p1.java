class p1{
public static void main(String args[]){

/*
output
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
   6 6 6 6 6 6
  7 7 7 7 7 7 7
 8 8 8 8 8 8 8 8
9 9 9 9 9 9 9 9 9
*/  
   
        for (int i = 1; i <= 9; i++)    
        {  
            /* Print i empty spaces at the beginning of each row */  
   
            for (int j = 8; j >= i; j--)   
            {  
                System.out.print(" ");  
            }  
   
            /* Print 'rowCount' value 'rowCount' times at the end of each row */  
   
            for (int j = 1; j <= i; j++)   
            {  
                System.out.print(i +" ");  
            }  
   
            System.out.println();  
   
           
   
           
        }  
}
}

