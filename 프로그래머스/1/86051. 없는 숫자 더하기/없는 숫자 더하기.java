import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        for(int x = 0; x < numbers.length; x++){
            list.add(numbers[x]);
        }
        
        for(int i = 0; i < 10; i++){
            if(!list.contains(i)){
                answer += i;
            }
        }
        return answer;
    }
}