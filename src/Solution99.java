class Solution99 {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String[] stringArr = quiz[i].split(" ");

            int num1 = Integer.parseInt(stringArr[0]);
            int num2 = Integer.parseInt(stringArr[2]);
            int num3 = Integer.parseInt(stringArr[4]); // 정답

            if(stringArr[1].equals("+")) {
                if((num1 + num2) == num3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }

            if(stringArr[1].equals("-")) {
                if((num1 - num2) == num3) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}