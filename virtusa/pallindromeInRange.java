public class pallindromeInRange {
    public static void main(String[] args) {
        
        for(int i=20;i<=40;i++){
            int num=i;
            int rev=0;
            while(num!=0){
                int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
            }
            
            if(rev==i){
                System.out.print(i+" ");
            }

            

        }
    
    
    }
}
