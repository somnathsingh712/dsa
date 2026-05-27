import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();


        // int num=Integer.parseInt(str);       //Convert into Integer
        // System.out.println(num);

        String toFind=sc.nextLine();

        int index=str.indexOf(toFind);      //To find the index of the given String
        System.out.println(index);
        
    }
}
