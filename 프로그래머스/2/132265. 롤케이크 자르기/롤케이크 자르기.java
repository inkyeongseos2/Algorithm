import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
    
        //1.map에 모든 데이터 밀어넣기
        for(int i = 0; i < topping.length; i++){
            map.put(topping[i], map.getOrDefault(topping[i],0)+1);
        }
        // System.out.println(map);
        
        for(int j = 0; j < topping.length; j++){
            //2.HashSet은 중복으로 저장 x
            set.add(topping[j]);
            map.put(topping[j],map.get(topping[j])-1);
            
            //3.map이 비어 있는 경우 아예 삭제
            if(map.get(topping[j]) == 0){
                map.remove(topping[j]);
            }
            
            //4.사이즈 비교
            if(map.size() == set.size()){
                answer++;
            }
            
        }
        
        return answer;
    }
}