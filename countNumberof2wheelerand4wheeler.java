import java.util.*; 
public class countNumberof2wheelerand4wheeler {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter vehicle");
        int V=sc.nextInt();
        System.out.println("enter wheels");
        int W=sc.nextInt();

        if(W>=2 && W%2==0 && W>V ){
            int y= (W-2*V)/2;
            int x= V-y;
            System.out.println(x+" "+y);
        }
        else{
            System.out.println("Invalid");
        }
    }
}
