import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        //min 값
        int minNum = 0;
        
        for(int i = people.length -1; i >= minNum; i--){
            //System.out.println(people[i]);
            if(people[minNum] + people[i] <= limit ){
                minNum++;  
                answer++;
            }else{
                answer++;
            }
            
        }
        
        return answer;
    }
}