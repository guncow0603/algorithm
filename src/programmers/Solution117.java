package programmers;

class Solution117 {
    public int solution(String[] babbling) {
        // 가능한 발음 조합
        String[] str = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        // 모든 babbling에 대해 반복
        for(int i=0; i<babbling.length; i++){
            // 각각의 발음 조합에 대해 반복
            for(int j=0; j<str.length; j++){
                // 현재 발음 조합을 " "으로 치환하여 제거
                babbling[i] = babbling[i].replace(str[j], " ");
            }

            // 모든 발음 조합을 제거한 후 문자열이 공백인 경우, 머쓱이의 조카가 발음 가능한 단어임을 의미하므로 answer 증가
            if(babbling[i].trim().length() == 0){
                answer++;
            }
        }
        return answer;
    }
}
