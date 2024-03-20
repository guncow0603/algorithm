package programmers;

class Solution43 {
    //자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
    // 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
    public int[] solution(long n) {
        int[] answer = new int[(int)( Math.log10(n)+1 )];
        int cnt=0;
        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            cnt++;
        }
        return answer;
    }
}