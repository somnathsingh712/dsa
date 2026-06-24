import java.util.Scanner;
public class frequencyOfOddBalloon {
    public static  void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        char arr[]=new char [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count%2!=0){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println("All are even");        
    }
}
