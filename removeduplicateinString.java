public class removeduplicateinString {
    public static void main(String[] args){
        String str="programming";
        String result=" ";
        for(int i=0;i<str.length()-1;i++){
            char ch=str.charAt(i);

            if(result.indexOf(ch)==-1){
                result=result+ch;
            }
        }
        System.out.println(result);
    }
}
