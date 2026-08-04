public class harshadNumber {
    public static void main(String[] args) {
        int n=379;
        int temp=n;
        int divisor=0;
        while(temp!=0){
            int digit=temp%10;
            divisor+=digit;
            temp/=10;
        }
        if(n%divisor==0){
            System.out.println("harshad number");
        }
        else{
            System.out.println("Not a harshard number");
        }
    }
}
