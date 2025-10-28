import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        //앞뒤 괄호 자르기
        s = s.substring(1,s.length()-1);
        
        String[] list = s.split("\\},");
        for(int i = 0; i< list.length; i++){
            list[i] = list[i].replaceAll("[\\{\\}]","");
            // System.out.println(list[i]);
        }
        
        //정렬
        Arrays.sort(list,(a,b) -> a.length() - b.length());
        
        List<Integer> result = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        for(String part: list){
            String[] nums = part.split(",");
            for(String numStr : nums){
                int num = Integer.parseInt(numStr);
                if(set.add(num)){
                    result.add(num);
                }
            }
        }
        
        answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}