import java.util.*;
public class prime {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    boolean prime=true;;
    int n=sc.nextInt();
    if(n<=1) prime=false;

    for(int i=2;i<Math.sqrt(n);i++){
        if(n%i==0){
            prime=false;
            break;
        }
    }
    if(prime){
        System.out.println("prime number");
    }
    else{
        System.out.println("Not prime");
    }
    }

}
