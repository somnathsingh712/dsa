import java.util.Scanner;
public class EnteringLeaving{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        int E[]=new int[t];
        int L[]=new int[t];

        System.out.println("Enter entering guest: ");
        for(int i=0;i<t;i++){
            E[i]=sc.nextInt();
        }
        System.out.println("Enter leaving guest: ");
        for(int i=0;i<t;i++){
            L[i]=sc.nextInt();
        }


        

        // int E[]={7,0,5,1,3};
        // int L[]={1,2,1,3,4};

        int guest=0;
        int maxGuest=0;

        for (int i=0;i<E.length;i++){
            guest=E[i]-L[i];
            maxGuest=Math.max(guest,maxGuest);
        }

        System.out.println(maxGuest);
    }
}
