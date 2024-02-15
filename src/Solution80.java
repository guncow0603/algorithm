import java.util.*;
class Solution80 {
    public int[] solution(String my_string) {
        int maxIndex=0;
        String nums="";

        for(int i=0;i<my_string.length();i++){
            for(int j=0;j<=9;j++){
                String a1=j+"";
                if(my_string.substring(i,i+1).equals(a1)){
                    nums=nums+a1;
                    maxIndex++;
                }
            }
        }
        int[] answer=new int[maxIndex];
        for(int i=0;i<maxIndex;i++){
            answer[i]=Integer.parseInt(nums.substring(i,i+1));
        }
        Arrays.sort(answer);
        return answer;
    }
}