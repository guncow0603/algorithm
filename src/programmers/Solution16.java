package programmers;

public class Solution16 {
    //정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
    // numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
    //짝수 홀수 개수
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                answer[0]+=1;
            }
            else{
                answer[1]+=1;
            }
        }
        return answer;
    }
}
