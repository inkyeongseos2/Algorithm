import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String operation : operations){
            String[] s = operation.split(" ");
            String txt = s[0];
            int num = Integer.parseInt(s[1]);
            
            if(txt.equals("I")){
                min.add(num);
                max.add(num);
            }else if(txt.equals("D")){
                if(min.isEmpty()){
                    continue;   
                }else if(num == 1){
                    int maxnum = max.poll();
                    min.remove(maxnum);
                }else if(num == -1){
                    int minnum = min.poll();
                    max.remove(minnum);
                }
            }
            
        }
        int[] answer = new int[2];
        
        if(min.isEmpty()){
            answer[0] = 0;
            answer[1] = 0;
        }else{
            answer[0] = max.peek();
            answer[1] = min.peek();
        }
        
        
        
        return answer;
    }
}