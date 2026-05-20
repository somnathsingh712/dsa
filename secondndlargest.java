import java.util.*;
public class secondndlargest {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8};
        int n=arr.length;
        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            System.out.print("");
        }
        System.out.println(arr[n-1]);       //for largest
        System.out.println(arr[n-2]);       //for 2nd largest
        System.out.println(arr[n-3]);       //for 3rd largest

    }
}
