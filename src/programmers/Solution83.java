package programmers;

import java.util.HashMap;
import java.util.Map;

class Solution83 {
    public String solution(String letter) {
        Map<String, String> morse = new HashMap<>();
        morse.put(".-", "a");
        morse.put("-...", "b");
        morse.put("-.-.", "c");
        morse.put("-..", "d");
        morse.put(".", "e");
        morse.put("..-.", "f");
        morse.put("--.", "g");
        morse.put("....", "h");
        morse.put("..", "i");
        morse.put(".---", "j");
        morse.put("-.-", "k");
        morse.put(".-..", "l");
        morse.put("--", "m");
        morse.put("-.", "n");
        morse.put("---", "o");
        morse.put(".--.", "p");
        morse.put("--.-", "q");
        morse.put(".-.", "r");
        morse.put("...", "s");
        morse.put("-", "t");
        morse.put("..-", "u");
        morse.put("...-", "v");
        morse.put(".--", "w");
        morse.put("-..-", "x");
        morse.put("-.--", "y");
        morse.put("--..", "z");
        StringBuilder answer = new StringBuilder();

        // 공백을 기준으로 문자열을 분할하여 각 부분을 처리
        String[] words = letter.split(" ");
        for (String word : words) {
            // 공백을 제외한 문자열이 모스 코드인 경우에만 변환
            if (morse.containsKey(word)) {
                answer.append(morse.get(word));
            }
        }

        return answer.toString();
    }
}