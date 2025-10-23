import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];        
        
        Map<String, Integer> idIndex = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            idIndex.put(id_list[i], i);
        }
        Set<String> re_report = new HashSet<>(Arrays.asList(report));
        
        Map<String,Integer> map = new HashMap<>();
        for(String r : re_report){
            String[] part = r.split(" ");
            
            map.put(part[1],map.getOrDefault(part[1],0)+1);
        }
       
        Set<String> people = new HashSet<>();
        for(String s : map.keySet()){
            if(map.get(s) >= k){
                people.add(s);
            }
        }
        
        for(String r : re_report){
            String[] part = r.split(" ");
            String p1 = part[0];    //신고한 사람
            String p2 = part[1];    //신고 당한 사람
            
            if(people.contains(p2)){
                int idx = idIndex.get(p1);
                answer[idx]++;
            }
        }
        
        return answer;
    }
}