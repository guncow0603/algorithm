package programmers;

class Solution104 {
    public String[] solution(String my_str, int n) {
        int strLength = my_str.length(); // 입력된 문자열의 길이를 구합니다.
        int arraySize = strLength % n == 0 ? strLength / n : strLength / n + 1; // 배열의 크기를 계산합니다.
        String[] answer = new String[arraySize]; // 결과를 저장할 배열을 생성합니다.

        char[] charArray = my_str.toCharArray(); // 문자열을 문자 배열로 변환합니다.
        int index = 0; // 문자 배열의 인덱스를 추적할 변수를 초기화합니다.

        for (int i = 0; i < arraySize; i++) { // 배열을 반복하며 부분 문자열을 구성합니다.
            StringBuilder sb = new StringBuilder(); // 부분 문자열을 저장할 StringBuilder를 생성합니다.
            for (int j = 0; j < n && index < strLength; j++) { // 각 부분 문자열을 구성합니다.
                sb.append(charArray[index]); // 문자를 StringBuilder에 추가합니다.
                index++; // 다음 문자의 인덱스로 이동합니다.
            }
            answer[i] = sb.toString(); // StringBuilder에 저장된 부분 문자열을 배열에 추가합니다.
        }

        return answer; // 결과 배열을 반환합니다.
    }
}
