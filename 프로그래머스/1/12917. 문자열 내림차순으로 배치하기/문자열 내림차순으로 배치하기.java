import java.util.*;

class Solution {
    public String solution(String s) {
        List<Character> list = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
        }
        
        Collections.sort(list,Collections.reverseOrder());
        
        for(Character c : list){
            sb.append(c);
        }
        return sb.toString();
    }
}