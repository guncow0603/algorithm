import java.util.Arrays;
class Solution49 {
    public int[] solution(int[] arr, int divisor) {
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                a++;
            }
        }
        if(a==0){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[a];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer[j]=arr[i];
                j++;
            }
        }
        Arrays.sort(answer);

        return answer;
    }
}