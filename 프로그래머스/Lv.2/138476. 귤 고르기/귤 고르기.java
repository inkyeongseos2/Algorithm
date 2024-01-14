import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        //1.map에 저장
        for(int i = 0; i < tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i],0)+1);
        }
        
        //2.map value 오름차순으로 저장
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Collections.reverseOrder());
        // System.out.println(list);
        
        //3.k랑 값 비교
        for (Integer num : list) {
            if (k <= 0) {
                break;
            }

            answer++;
            k -= num;
        }
        
        return answer;
    }
}