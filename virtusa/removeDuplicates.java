public class removeDuplicates {
    public static void main(String[] args) {
        int arr[]={2,3,1,9,3,1,3,9};
        int n=arr.length;
        // Arrays.sort(arr);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]!=arr[j-1]){
                    System.out.print(arr[i]+" ");
                    break;
                }

            }
            
        }

    }

}
