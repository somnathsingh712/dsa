import java.util.Scanner;

public class buyAndSell {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
//for the question best time to buy and sell stock, we need to find the profit first by subtracting minimum from maximum
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.print(max-min);
    }

}
