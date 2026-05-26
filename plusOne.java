import java.util.Scanner;

public class plusOne {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]<9){       //check if the last digit of array is greater that 9 or not
                arr[i]++;       //if less than 9 , then increase by 1
                break;
            }
            else{
                arr[i]=0;       //if 9 then directly allot 0 
            }
            
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
