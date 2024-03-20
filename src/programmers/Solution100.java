package programmers;

class Solution100 {
    public int solution(int num, int k) {
        int answer = 0;
        String strNumber = Integer.toString(num);
        int[] digits = new int[strNumber.length()];
        for (int i = 0; i < strNumber.length(); i++) {
            digits[i] = Character.getNumericValue(strNumber.charAt(i));
        }
        for(int i=0;i<digits.length;i++){
            if(digits[i]==k){
                answer=i+1;
                break;
            }
            else if(i==digits.length-1){
                answer=-1;
            }
        }
        return answer;
    }
}