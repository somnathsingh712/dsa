import java.util.Scanner;
public class maximumParkingRow {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);


        int r=sc.nextInt();
        int c=sc.nextInt();
        int M[][]=new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                M[i][j]=sc.nextInt();
            }
        }

        int Maxvehicle=0;
        int row=-1;


        for(int i=0;i<r;i++){
            int vehicle=0;
            for(int j=0;j<c;j++){
                if(M[i][j]==1){
                    vehicle++;
                    
                }
            }
            if(vehicle>Maxvehicle){
                Maxvehicle=vehicle;
                row=i+1;
            }
        }
        System.out.println(row);
    }
}
