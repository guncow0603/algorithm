package programmers;

class Solution106 {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        int halfWidth = board[0] / 2;
        int halfHeight = board[1] / 2;

        for (String direction : keyinput) {
            switch (direction) {
                case "left":
                    if (answer[0] > -halfWidth)
                        answer[0]--;
                    break;
                case "right":
                    if (answer[0] < halfWidth)
                        answer[0]++;
                    break;
                case "up":
                    if (answer[1] < halfHeight)
                        answer[1]++;
                    break;
                case "down":
                    if (answer[1] > -halfHeight)
                        answer[1]--;
                    break;
            }
        }

        return answer;
    }
}
