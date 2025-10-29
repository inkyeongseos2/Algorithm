import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int num = nums.length/2; //가져갈 수 있는 폰켓몬 수
        
        Map<Integer,Integer> map = new HashMap<>(); //map에 종류 저장
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        // System.out.println(map);
        // System.out.println(map.size());
        if(map.size() >= num){
            answer = num;
        }else{
            answer = map.size();
        }
        return answer;
    }
}