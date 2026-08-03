import java.util.*;
public class addressOfSortedEle {
    public static void main(String[] args) {
        int arr[]={1,4,2,7,5,2};
        int n =arr.length;
        for(int i=0;i<n;i++){
            Arrays.sort(arr);
            System.out.print(arr[i]+" ");
            
        }
    }
}
