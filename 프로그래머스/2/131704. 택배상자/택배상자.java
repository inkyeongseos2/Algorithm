import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int index  = 0;    //order의 index
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 1; i < order.length+1; i++){
            if(order[index] == i){
                index++;
                answer++;
            }else{
                stack.push(i);
            }
            
            
            while(!stack.isEmpty() && stack.peek() == order[index]){
                stack.pop();
                index++;
                answer++;
            }
        }
        return answer;
    }
}