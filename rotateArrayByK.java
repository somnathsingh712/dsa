import java.util.Scanner;

public class rotateArrayByK {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int k=sc.nextInt();

        int start=n-k;
        for(int i=start;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<start;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
