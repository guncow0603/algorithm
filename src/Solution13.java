public class Solution13 {
    //정수 배열 numbers가 매개변수로 주어집니다.
    // numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
    //최댓값 만들기(1)
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;

        for(int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > max) {
                    max = numbers[i] * numbers[j];
                }
            }
        }
        answer = max;
        return answer;
    }
}
