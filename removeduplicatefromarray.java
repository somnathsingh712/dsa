import java.util.Scanner;

public class removeduplicatefromarray {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n=sc.nextInt();
       
       int arr[]=new int[n];

       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }

  
       for(int i=0;i<n-1;i++){      //Run loop throughout the array
        if(arr[i]!=arr[i+1]){       //If the current element is not equal to next element of sorted array
            System.out.print(arr[i]+" ");       //Then print element
        }
       }
       System.out.println(arr[n-1]);        //Print the remaining last element
    }
}
