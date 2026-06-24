public class countStarAndHash {
    String str="*#*#*#";
    count1=0;
    count2=0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='*'){
            count1++;
        }
        else{
            count2++;
        }
        System.out.println(count1-count2);
    }
    

}
