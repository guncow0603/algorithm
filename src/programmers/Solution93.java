package programmers;

import java.util.Arrays;
class Solution93 {
    public int solution(int[] array, int n) {
        // 주어진 배열을 오름차순으로 정렬
        Arrays.sort(array);

        // 결과값을 저장할 변수 초기화
        int closest = Integer.MAX_VALUE;
        int answer = 0;

        // 배열을 순회하며 n과의 차이가 최소인 수를 찾음
        for (int num : array) {
            int diff = Math.abs(num - n); // 현재 수와 n의 차이 계산
            if (diff < closest) {
                closest = diff; // 더 작은 차이가 나오면 업데이트
                answer = num; // 현재 수를 답으로 저장
            }
        }

        return answer;
    }
}