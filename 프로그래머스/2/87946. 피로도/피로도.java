import java.util.*;

class Solution {
    
    public boolean[] check;
    public int answer = -1;
    
    public int solution(int k, int[][] dungeons) {
        check = new boolean[dungeons.length];
        
        dfs(0, k , dungeons);
        
        return answer;
    }
    
    public void dfs(int count, int k, int[][] dungeons){
        for(int i = 0; i < dungeons.length; i++){
            if(check[i] == false && dungeons[i][0] <= k){
                check[i] = true;
                dfs(count + 1, k - dungeons[i][1], dungeons);
                check[i] = false;   //초기화
            }
        }
        answer = Math.max(answer, count);
    }
}