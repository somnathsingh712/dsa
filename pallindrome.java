import java.util.*;
public class pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int temp=sc.nextInt();
        int n=temp;

    int rev=0;
    while(n!=0){
        int digit=n%10;
        rev=rev*10 + digit;
        n=n/10;
    }
    if(temp==rev){
        System.out.println("pallindrome");
    }
    else{
        System.out.println("not pallindrome");
    }
    }
}
