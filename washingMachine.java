import java.util.Scanner;
public class washingMachine {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter weight: ");
        int n=sc.nextInt();
        if(n>0 && n<=2000){
            System.out.println("Time estimated: 25 minutes");
        }
        else if(n>=2001 && n<=4000){
            System.out.println("Time estimated: 35 minutes");
        }
        else if(n>=4001 && n<=7000){
            System.out.println("Time estimated: 45 minutes");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
