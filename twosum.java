import java.util.*;
public class twosum {
    public static void main(String[] args){
        System.out.println("enter length");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter elements of array");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter target");
        int target=sc.nextInt();

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                    return;
                }
                
                
            }
        }
        System.out.println("No pair found");
    }
}
