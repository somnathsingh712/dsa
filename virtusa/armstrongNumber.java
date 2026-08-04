public class armstrongNumber {
    public static void main(String[] args) {
        int n=371;
    int temp=n;
    int digits=0;
    while(temp!=0){
        digits++;
        temp/=10;
    }

    int sum=0;
    temp=n;
    while(temp!=0){
        int digit=temp%10;
        sum+=Math.pow(digit,digits);
        temp/=10;
    }

    if(sum==n){
        System.out.println("Armstrong Number");
    }
    else{
        System.out.println("Not an Armstrong Number");
    }

    }
    
}
