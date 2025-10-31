import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++){
            int remain = 100 - progresses[i];
            int day = (int)Math.ceil((double)remain/speeds[i]);
            queue.add(day);
        }
        
        List<Integer> list = new LinkedList<>();
        while(!queue.isEmpty()){
            int first = queue.poll(); //기준일
            int count = 1 ; //일단 기준일 하나 꺼냈으니까
            
            while(!queue.isEmpty() && queue.peek() <= first){
                count++;
                queue.poll();
            }
            list.add(count);
        }
        int[] answer = new int[list.size()];
        
        for(int n = 0; n < list.size(); n++){
            answer[n] = list.get(n);
        }
        
        return answer;
    }
}