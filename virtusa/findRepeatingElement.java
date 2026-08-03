public class findRepeatingElement {
    public static void main(String[] args){
        int arr[]={1,2,-1,1,3,1};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int count=0;
            for(int j=i;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
