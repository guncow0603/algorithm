import java.util.*;
class Solution101 {
    public String solution(String my_string) {
        String answer = "";
        char[] charArray = my_string.toCharArray();
        for(int i=0;i<my_string.length();i++){
            if(Character.isUpperCase(charArray[i])){
                charArray[i]=Character.toLowerCase(charArray[i]);
            }
        }
        Arrays.sort(charArray);
        for(int i=0;i<my_string.length();i++){
            answer+=charArray[i];

        }

        return answer;
    }
}