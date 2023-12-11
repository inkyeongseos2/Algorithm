import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;   
        
        while(n != 0){
            if(n % 2 == 0){
                //짝수이면
                n /= 2;
            }else if(n % 2 != 0){
                //홀수이면
                n--;
                ans++;
            }
        }
       
        return ans;
    }
}