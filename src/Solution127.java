import java.util.*;
import java.util.Map.Entry;

class Solution127 {
    public String[] solution(String[] players, String[] callings) {

        int numOfPlayers = players.length;
        Map<String, Integer> ranking = new HashMap<>();

        for (int i=0; i<numOfPlayers ; i++) {
            ranking.put(players[i], i);
        }



        //경주 진행
        for (String player : callings) {
            //1) player의 이름에 해당하는 value를 저장한다. 
            int playerRanking = ranking.get(player);

            //2) player보다 앞에 있는 사람을 발견하고, value를 변경함
            String frontPlayer = getKey(ranking, playerRanking - 1 );
            ranking.replace(frontPlayer, playerRanking);

            //3) player의 랭킹을 앞으로 변경함.
            ranking.replace(player, playerRanking-1);
        }


        //결과 만들기
        String[] answer = new String[numOfPlayers];

        for( Entry <String, Integer> entrySet : ranking.entrySet()) {
            answer[entrySet.getValue()] = entrySet.getKey();
        }

        return answer;
    }

    // hashmap에 value 로 key 찾기
    public static <K, V> K getKey(Map<K, V> map, V value) {

        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
    }
}