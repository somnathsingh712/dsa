import java.util.Scanner;

public class countDigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=0;

        while(n!=0){
            n=n/10;     //get each digit
            count++;        //increase the count after each cycle
        }

        System.out.println(count);
    }
}
