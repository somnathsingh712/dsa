import java.util.*;
public class countwordsofString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      String str=sc.nextLine().trim();

      if(str.isEmpty()){
        System.out.println(0);
      }
      else{
        String words[]=str.split("\\s+");
        System.out.println(words.length);
      }

    }
}
