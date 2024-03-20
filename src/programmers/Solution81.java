package programmers;

class Solution81 {
    public String solution(int age) {
        StringBuilder answer= new StringBuilder();
        while(age>0){
            answer.insert(0,(char)((age%10)+(int)'a'));
            age/=10;
        }

        return answer.toString();
    }
}