import java.util.*;
public class median {
    public static void main(String[] args){
        int arr[]={2,5,1,7};
        int n=arr.length;
        Arrays.sort(arr);
        int mid=n/2;
        if(n%2!=0){
            System.out.println(arr[mid]);
        }
        else{
            double med=(arr[mid-1]+arr[mid])/2.0;
            System.out.println(med);
        }
        
    }
}
