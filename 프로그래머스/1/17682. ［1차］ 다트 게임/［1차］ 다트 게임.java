import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        List<Integer> list = new LinkedList<>();
        int num = 0;
        for(int i = 0; i < dartResult.length(); i++){
            char c = dartResult.charAt(i);
            
            if(Character.isDigit(c)){
                if(c == '1' && i+ 1 < dartResult.length() && dartResult.charAt(i+1) == '0'){
                    num = 10;
                    i++;
                }else{
                    num = c - '0';
                }
            }else if(c == 'S'){
                list.add((int)Math.pow(num,1));
            }else if(c == 'D'){
                list.add((int)Math.pow(num,2));
            }else if(c == 'T'){
                list.add((int)Math.pow(num,3));
            }
            
            else if(c == '*'){
                int size = list.size();
                list.set(size -1, list.get(size-1) *2);
                
                if(size > 1){
                    list.set(size -2, list.get(size-2) *2);
                }
            }else if(c == '#'){
                int size = list.size();
                list.set(size -1, list.get(size-1) * -1);
            }
        }
        
        for(int n : list){
            answer += n;
        }
        
        return answer;
    }
}