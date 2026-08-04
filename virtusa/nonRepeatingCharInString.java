public class nonRepeatingCharInString {
    public static void main(String[] args) {
        String str="google";
        int n=str.length();
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.print(str.charAt(i)+" ");
            }
        }
    }
}
