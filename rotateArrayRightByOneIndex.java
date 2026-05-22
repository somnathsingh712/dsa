import java.util.Scanner;

public class rotateArrayRightByOneIndex {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int temp[]=new int[n];
        temp[0]=arr[n-1];

        for(int i=0;i<n-1;i++){
            temp[i+1]=arr[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
