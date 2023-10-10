public class Solution10 {
    //정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
    //배열 뒤집기
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j=0;
        for(int i=num_list.length-1;i>=0;i--){
            answer[j]= num_list[i];
            j+=1;
        }
        return answer;
    }
}
