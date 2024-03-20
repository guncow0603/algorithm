package programmers;

class Solution69 {
    //어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
    // 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
    // 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
    public String solution(String s, int n) {
        // 결과 문자열을 저장할 변수 선언
        String answer = "";

        // 문자열의 각 문자에 대해 반복
        for (int i = 0; i < s.length(); i++) {
            // 현재 문자 가져오기
            char ch = s.charAt(i);

            // 소문자인 경우
            if (Character.isLowerCase(ch)) {
                // 시저 암호 적용
                ch = (char) ((ch - 'a' + n) % 26 + 'a');
            }
            // 대문자인 경우
            else if (Character.isUpperCase(ch)) {
                // 시저 암호 적용
                ch = (char) ((ch - 'A' + n) % 26 + 'A');
            }

            // 결과 문자열에 암호화된 문자 추가
            answer += ch;
        }

        // 최종 암호화된 문자열 반환
        return answer;
    }
}
