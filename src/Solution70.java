import java.util.HashMap;

class Solution70 {
    //네오와 프로도가 숫자놀이를 하고 있습니다. 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
    public int solution(String s) {
        // 영어 단어를 숫자로 매핑하는 HashMap 생성
        HashMap<String, Integer> wordMap = new HashMap<>();
        wordMap.put("zero", 0);
        wordMap.put("one", 1);
        wordMap.put("two", 2);
        wordMap.put("three", 3);
        wordMap.put("four", 4);
        wordMap.put("five", 5);
        wordMap.put("six", 6);
        wordMap.put("seven", 7);
        wordMap.put("eight", 8);
        wordMap.put("nine", 9);

        // 정규표현식을 활용하여 영어 단어를 숫자로 변환
        for (String word : wordMap.keySet()) {
            // 문자열에서 해당 영어 단어를 찾아 숫자로 치환
            s = s.replaceAll(word, String.valueOf(wordMap.get(word)));
        }

        // 결과를 정수로 변환하여 반환
        return Integer.parseInt(s);
    }
}
