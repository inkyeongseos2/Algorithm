import java.util.*;

class Solution {
    static List<String> list = new ArrayList<>();
    char[] cword = {'A','E','I','O','U'};
    
    public int solution(String word) {
        dfs("",0);
        Collections.sort(list);
        return list.indexOf(word) + 1;
    }
    
    public void dfs(String str, int depth){
        if(depth > 5) return;
        if(!str.isEmpty()) list.add(str);
        
        for(char c : cword){
            dfs(str + c, depth +1);
        }
    }
}