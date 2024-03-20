package programmers;

import java.util.*;
class Solution78 {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int a1=numbers[numbers.length-1]*numbers[numbers.length-2];
        int a2=numbers[0]*numbers[1];

        answer=(a1>a2)?a1:a2;
        return answer;
    }
}