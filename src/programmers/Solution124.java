package programmers;

class Solution124 {
    // num 개의 숫자로 이루어진 배열을 반환하는 메서드
    // 각 숫자의 합은 total이며, 숫자들의 간격은 가능한한 균일하게 유지됩니다.
    public int[] solution(int num, int total) {
        // 반환할 배열 생성
        int[] answer = new int[num];
        // 간격 계산을 위한 시작 값 계산
        int start = (total / num) - ((num - 1) / 2);

        // 배열을 순회하면서 각 숫자를 채움
        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }

        // 결과 배열 반환
        return answer;
    }
}