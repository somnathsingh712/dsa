public class cipher {
    public static void main(String[] args) {
        String s="All the best";
        int n=s.length();
        int key=1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                System.out.print(" ");
            }
            else{
                char ch=s.charAt(i);
            int ASCII=ch+key;
            System.out.print((char)ASCII);
            }
            
            
        }
    }
}
