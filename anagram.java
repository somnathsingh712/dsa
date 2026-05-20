import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String a="rama";
        String b="amar";
        char[] x=a.toCharArray();
        char[] y=b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(Arrays.equals(x,y)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
