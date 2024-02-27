class Solution98 {
    public int solution(String my_string) {

        String[] result = my_string.split(" ");
        int answer = Integer.parseInt(result[0]);

        for(int i=1;i<result.length;i++){
            if(result[i].equals("+")){
                answer +=Integer.parseInt(result[i+1]);

            }else if(result[i].equals("-")){
                answer -=Integer.parseInt(result[i+1]);

            }
        }
        return answer;
    }
}