package programmers;

import java.util.Arrays;
import java.util.Comparator;

class Solution71 {
    //문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    // 예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
    public String[] solution(String[] strings, int n) {
        // Comparator를 사용하여 정렬
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 글자를 비교
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                // n번째 글자가 같으면 사전순으로 정렬
                if (c1 == c2) {
                    return s1.compareTo(s2);
                } else {
                    return Character.compare(c1, c2);
                }
            }
        });

        // 정렬된 배열 반환
        return strings;
    }
}
