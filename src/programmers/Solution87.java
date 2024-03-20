package programmers;

class Solution87 {
    public int solution(int[] numbers, int k) {
        int index = 0; // 시작 인덱스를 0으로 초기화
        for (int i = 1; i < k; i++) {
            index +=2; // 오른쪽으로 한 명을 건너뛰면서 인덱스 갱신
        }
        index%=numbers.length;
        return numbers[index];
    }
}