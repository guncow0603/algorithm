class Solution121 {
    public int solution(int i, int j, int k) {
        int answer = 0; // 결과를 저장할 변수를 초기화합니다.
        while (i <= j) { // i가 j 이하인 동안 반복합니다.
            String currentNumber = Integer.toString(i); // 현재 숫자 i를 문자열로 변환합니다.
            char[] charArray = currentNumber.toCharArray(); // 문자열을 문자 배열로 변환합니다.
            for (int l = 0; l < charArray.length; l++) { // 문자 배열의 각 문자에 대해 반복합니다.
                if (charArray[l] == (char)(k + '0')) { // 현재 문자가 k와 같은지 확인합니다. k를 문자로 변환합니다.
                    answer++; // k와 일치하는 문자를 찾으면 결과를 증가시킵니다.
                }
            }
            i++; // 다음 숫자로 이동합니다.
        }
        return answer; // 결과를 반환합니다.
    }
}
