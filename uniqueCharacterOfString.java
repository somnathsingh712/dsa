import java.util.Scanner;
public class uniqueCharacterOfString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();

        for(int i=0;i<str.length()-1;i++){
            char ch=str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                System.out.println(str.indexOf(ch));
                break;
            }
        }
    }
}
