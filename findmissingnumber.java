import java.util.*;
public class findmissingnumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      int n=sc.nextInt();
      int arr[]=new int[n];

      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }

      int sum=0;
      for(int i=0;i<n-1;i++){
        sum+=arr[i];
      }

      int total=n*(n+1)/2;
      System.out.println("missing element: "+(total-sum));
    }
}
