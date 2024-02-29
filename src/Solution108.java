class Solution108 {
    public int solution(String my_string) {
        int answer = 0;
        int result = 0; // 결과를 정수형으로 저장
        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                result = result * 10 + digit; // 현재 숫자를 더해줌
            } else {
                answer += result; // 현재까지 찾은 숫자의 합을 누적
                result = 0; // result 초기화
            }
        }
        // 마지막 숫자가 있는 경우 처리
        answer += result;
        return answer;
    }
}
