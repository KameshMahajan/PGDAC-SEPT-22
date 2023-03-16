import java.util.Arrays;
import java.util.Scanner;

public class array_max_3_no_show {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter number");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        int largest=0;
        for(int i=arr.length-1;i>0;i--){
           
            if(arr[i-1]<arr[i]){
                count++;
                largest=arr[i-1];
            }
            if(count==1){
                break;
            }
        }
        System.out.println(largest);
    
        

    }
}
