package programmers;

import java.util.Arrays;
class Solution49 {
    //array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    //divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
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