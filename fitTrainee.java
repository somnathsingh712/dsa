import java.util.Scanner;
public class fitTrainee {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int trainee[][]=new int [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                trainee[i][j]=sc.nextInt();

                if(trainee[i][j]<1 || trainee[i][j]>100){
                    System.out.println("INVALLID");
                    return;
                }
            }
        }
        // int avg=0;
        // for(int i=0;i<3;i++){
        //     int sum=0;
        //     for(int j=0;j<3;j++){
        //         sum+=trainee[j][i];
                
        //     }
        //     int avg=Math.round(sum/3.0f);
        //     System.out.println(avg);
        // } 
        int oxygenlevel[]=new int[3];
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum+=trainee[j][i];
            }
            float avg=(float)sum/3;
            int ravg=Math.round(avg);
            oxygenlevel[i]=ravg;
        }
        int max=oxygenlevel[0];
        for(int i=1;i<3;i++){
            if(oxygenlevel[i]>max){
                max=oxygenlevel[i];
            }
        }
        if(max<70){
            System.out.println("All trainees are unfit.");
            return;
        }
        for(int i=0;i<3;i++){
            if(oxygenlevel[i]==max){
                System.out.println("Trainee number: "+(i+1));
            }
        }
             
    }
}
