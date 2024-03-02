import java.util.*;

class Solution116 {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        Integer[] result = new Integer[score.length];

        // 각 학생의 총점 계산
        for(int i = 0; i < score.length; i++) {
            result[i] = score[i][0] + score[i][1];
        }

        // 총점을 내림차순으로 정렬
        Arrays.sort(result, Collections.reverseOrder());

        // 랭크 할당
        int rank = 1;
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < score.length; j++) {
                if(result[i] == score[j][0] + score[j][1] && answer[j] == 0) {
                    // 같은 총점을 가진 학생에게 같은 랭크 부여
                    answer[j] = rank;
                }
            }
            rank++;
        }
        return answer;
    }
}
