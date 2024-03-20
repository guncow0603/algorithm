package programmers;

class Solution94 {
    public int solution(int order) {
        int answer = 0;
        int num;
        while(order>0){
            num=order%10;
            order/=10;
            if(num%3==0&&num!=0){
                answer++;
            }
        }
        return answer;
    }
}