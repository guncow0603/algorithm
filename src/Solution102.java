import java.util.*;

class Solution102 {
    public int solution(String before, String after) {
        int answer = 0;

        // 주어진 문자열을 문자 배열로 변환
        char[] beforeArray = before.toCharArray();
        char[] afterArray = after.toCharArray();

        // 문자 배열을 정렬
        Arrays.sort(beforeArray);
        Arrays.sort(afterArray);

        // 정렬된 문자 배열을 다시 문자열로 변환
        String sortedBefore = new String(beforeArray);
        String sortedAfter = new String(afterArray);

        // 정렬된 문자열끼리 비교하여 같으면 1, 다르면 0을 반환
        answer = sortedBefore.equals(sortedAfter) ? 1 : 0;

        return answer;
    }
}
