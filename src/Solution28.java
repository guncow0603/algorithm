public class Solution28 {
    //문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
    //숨어있는 숫자의 덧셈 (1)
    class Solution {
        public int solution(String my_string) {
            int answer = 0;
            for(int i=0;i<my_string.length();i++){
                for(int j=1;j<10;j++){
                    String value=j+"";

                    if(value.equals(my_string.substring(i,i+1))){
                        answer+=j;
                    }
                }
            }
            return answer;
        }
    }
}
