import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        
        for(String s : participant){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        // System.out.println(map);
        for(String c : completion){
            map.put(c,map.get(c)-1);
        }
        
        // System.out.println(map);
        for(String key : map.keySet()){
            if(map.get(key) != 0){
                return key;
            }
        }
        return "";
    }
}