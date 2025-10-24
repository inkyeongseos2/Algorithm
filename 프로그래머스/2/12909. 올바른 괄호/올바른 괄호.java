import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(!stack.isEmpty()){
                if(c == '('){
                    stack.push(c);
                }else{
                    if(stack.peek() == '('){
                        stack.pop();
                    }else{
                        stack.push(c);
                    }
                }
            }else{
                stack.push(c);
            }
            // System.out.println(stack);
        }

        if(stack.isEmpty()){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}