package programmers;

class Solution110 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2; // 초기 답은 2로 설정됩니다. (모든 스펠이 사전에 없는 경우를 가정합니다)
        int cnt = 0; // 스펠 단어가 사전에 있는지를 확인하는 카운터입니다.

        // 사전의 각 단어를 확인합니다.
        for (String dicWord : dic) {
            cnt = 0; // 스펠 단어 카운터를 초기화합니다.

            // 스펠의 각 단어를 확인합니다.
            for (String spellWord : spell) {
                // 사전 단어에 현재 스펠 단어가 포함되어 있는지 확인합니다.
                if (dicWord.contains(spellWord)) {
                    cnt++; // 스펠 단어가 사전에 존재하면 카운터를 증가시킵니다.
                }
            }

            // 만약 모든 스펠 단어가 사전에 존재한다면
            if (cnt >= spell.length) {
                answer = 1; // 답을 1로 설정하고 반복문을 종료합니다.
                break;
            }
        }

        return answer; // 최종 답을 반환합니다.
    }
}
