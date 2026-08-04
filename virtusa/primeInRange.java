public class primeInRange {
    public static void main(String[] args){
        int start=10;
        int end=20;
        for(int i=start;i<end;i++){
            if(i<2){
                continue;
            }

            boolean prime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime){
                System.out.print(i+" ");
            }
        }

    }
}
