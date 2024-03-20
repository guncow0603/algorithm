package programmers;

public class Solution21 {
    //영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
    // 문자열 my_string이 매개변수로 주어질 때 모음을
    // 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
    //모음 제거
    public String solution(String my_string) {
        String answer = "";
        String[] replace = {"a", "e", "i", "o", "u"};
        for(int i = 0; i<replace.length; i++) {
            if( my_string.contains(replace[i])) {
                answer = my_string.replaceAll(replace[i], "");
                my_string = answer;
            } else {
                answer =my_string;
            }
        }


        return answer;
    }
}