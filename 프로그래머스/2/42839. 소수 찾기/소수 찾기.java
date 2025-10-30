import java.util.*;
class Solution {
    Set<Integer> set = new HashSet<>();
    boolean[] visited;
    public int solution(String numbers) {
        int answer = 0;
        visited = new boolean[numbers.length()];
        
        //모든조합생성
        dfs("", numbers);
        
        for(int num : set){
            if(isPrime(num)) answer++;
        }
        return answer;
    }
    
    private void dfs(String current, String numbers){
        if(!current.equals("")){
            set.add(Integer.parseInt(current));
        }
        
        for(int i = 0; i < numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(current + numbers.charAt(i), numbers);
                visited[i] = false;
            }
        }
    }
    
    private boolean isPrime(int n){
        if(n < 2) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        
        for(int i = 3; i* i <= n; i++){
            if(n % i == 0) return false;
        }
        
        return true;
    }
}