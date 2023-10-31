public class Solution35 {
    //대문자와 소문자
    //문자열 my_string이 매개변수로 주어질 때,
    // 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
    public String solution(String my_string) {
        String answer = "";
        char a;

        for(int i = 0;i<my_string.length() ; i++){
            a=my_string.charAt(i);
            int b=a;

            if(b>64&&b<91){
                char c=(char)(b+32);
                answer+=c;

            }
            else if(b>96&&b<123){
                char c=(char)(b-32);
                answer+=c;

            }
        }

        return answer;
    }

}