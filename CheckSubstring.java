import java.util.Scanner;

public class CheckSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String sub=sc.nextLine();

        if(str.contains(sub)){
            System.out.println("Substring");
        }
        else{
            System.out.println("Not Substring");
        }
    }
}
