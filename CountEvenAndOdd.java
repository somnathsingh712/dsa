import java.util.Scanner;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int evenCount=0;
        int oddCount=0;

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            
        }
        System.out.println("Even Count: "+evenCount+" "+ "Odd Count: "+" "+oddCount);
        // System.out.println(oddCount);
    }
}
