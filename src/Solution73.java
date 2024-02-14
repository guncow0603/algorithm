import java.util.*;
class Solution73 {
    //최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
    // 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int max = array[array.length-1];
        int count[] =new int[max+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }
        max=count[0];
        for(int i=1;i<count.length;i++){
            if(max<count[i]){
                max=count[i];
                answer=i;
            }else if(max==count[i]){
                answer=-1;
            }
        }

        return answer;
    }
}