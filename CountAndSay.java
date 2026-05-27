import java.util.Scanner;

class CountAndSay{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str= sc.nextLine();
         int count=1;
         String result="";

         for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                result=result+count+str.charAt(i);
                count=1;
            }

         }
         result=result + count + str.charAt(str.length()-1);
         System.out.println(result);
    }
}