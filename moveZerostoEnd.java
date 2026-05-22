import java.util.Scanner;

public class moveZerostoEnd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int index=0;        //initially take index as zero
        for(int i=0;i<n;i++){
            if(arr[i]!=0){      //if the element at index position is non zero
                arr[index++]=arr[i];        //then store the element at index and move on
            }
        }

        while(index<n){         //while index value remains less then size of array
            arr[index++]=0;     //then put zero there directly
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");        }      //print the array now
    }
}
