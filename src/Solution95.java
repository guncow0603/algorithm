class Solution95 {
    public long solution(String numbers) {
        // 영어 단어에 대응하는 숫자 배열
        String[] numberWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // 영어 단어를 숫자로 변환하여 더할 변수
        long sum = 0;

        // numbers에 포함된 영어 단어를 해당하는 숫자로 변환하여 더함
        for (int i = 0; i < numberWords.length; i++) {
            numbers = numbers.replaceAll(numberWords[i], String.valueOf(i));
        }

        // 변환된 문자열을 정수로 변환하여 더함
        sum = Long.parseLong(numbers);

        return sum;
    }
}
