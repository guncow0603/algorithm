import java.util.*;

class Solution96 {
    public String solution(String s) {
        Map<Character, Integer> charCount = new HashMap<>();

        // 문자열에서 각 문자의 등장 횟수를 카운트
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        StringBuilder uniqueChars = new StringBuilder();

        // 등장 횟수가 1인 문자들을 문자열에 추가
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                uniqueChars.append(c);
            }
        }
        //정렬
        char[] uniqueCharsArray = uniqueChars.toString().toCharArray();

        Arrays.sort(uniqueCharsArray);

        return new String(uniqueCharsArray);
    }
}