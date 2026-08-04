public class perfectNumber {
    public static void main(String[] args){
        int n=15;
        int temp=n;
        int sum=0;
        
            for(int i=1;i<temp;i++){
                if(temp%i==0){
                    sum+=i;
                }
            }
        
        if(n==sum){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not perfect Number");
        }
    }
}
