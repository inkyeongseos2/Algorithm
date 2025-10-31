import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap  = new PriorityQueue<>();
        
        for(int n : scoville){
            heap.add(n);
        }
        

        while(heap.size() > 1 && heap.peek() < K){
            // System.out.println(ch);
            int ch = heap.poll() + (heap.poll() * 2);
            answer++;
            heap.add(ch);
        }
        
        if(heap.peek() < K){
            return -1;
        }
        
        return answer;
    }
}