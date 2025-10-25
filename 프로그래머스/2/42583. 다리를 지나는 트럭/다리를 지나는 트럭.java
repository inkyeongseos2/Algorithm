import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Boolean ch= true;
        int sum = 0;    //다리 위 총 무게
        int idx = 0;    //truck_weights의 인덱스 
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0; i < bridge_length; i++){
            queue.add(0);
        }
        
        while(idx < truck_weights.length){
            answer++;   //1초지남
            
            int left = queue.poll();//첫번째꺼 꺼냄
            sum -= left;            //총무게 구해주기
            
            int right = truck_weights[idx];
            if(sum + right <= weight){
                queue.add(right);
                sum += right;
                idx++;
            }else{
                queue.add(0);   //1초 뒤에 못 올리면 거기는 빈칸
            }
            // System.out.println(queue);
        }
        
        answer += queue.size(); //남아있는 트럭
        return answer;
    }
}