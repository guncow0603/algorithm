package programmers;

class Solution109 {
    public int solution(int[] sides) {
        int answer = 0;
        // 주어진 변의 길이 중에서 큰 값과 작은 값을 구합니다.
        int big = (sides[0] > sides[1] ? sides[0] : sides[1]);
        int small = (sides[0] < sides[1] ? sides[0] : sides[1]);

        // 큰 값과 작은 값의 차이에 1을 더한 값을 시작으로 하여 반복합니다.
        for (int i = (big - small) + 1; i <= big; i++) {
            // 한 변의 길이를 결정할 수 있는 경우마다 answer를 증가시킵니다.
            answer++;
        }

        // 큰 값과 작은 값의 차이에 1을 더한 값을 시작으로 하여 반복합니다.
        for (int i = big + 1; i < big + small; i++) {
            // 한 변의 길이를 결정할 수 있는 경우마다 answer를 증가시킵니다.
            answer++;
        }

        return answer;
    }
}
