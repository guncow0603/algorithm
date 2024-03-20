package programmers;

class Solution120 {
    public String solution(String bin1, String bin2) {
        // 두 이진수를 더하여 결과를 저장할 변수 선언
        String answer = "";

        // 이진수 문자열을 정수로 변환
        int bin1Value = Integer.parseInt(bin1, 2);
        int bin2Value = Integer.parseInt(bin2, 2);

        // 두 이진수를 정수로 변환한 값을 더하고 다시 이진수 문자열로 변환하여 결과에 저장
        answer = Integer.toBinaryString(bin1Value + bin2Value);

        // 결과 반환
        return answer;
    }
}
