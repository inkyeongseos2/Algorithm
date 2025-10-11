import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        List<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        // int[0]은 물
        
        //한쪽 값 구하기
        for(int i = 1; i < food.length; i++){
            int num = food[i];
            if(num % 2 == 0){
                num = num /2;
            }else{
                num = (num-1) /2;
            }
            
            while(num > 0){
                list.add(i);
                sb.append(i);
                num = num -1;
            }
            System.out.println(list);
        }
        
        //2.가운데 물 넣기
        sb.append("0");
        
        //3.list 역순 만들기
        Collections.sort(list, Collections.reverseOrder());
        
        //4.역순한거 넣기
        for(int j : list){
            sb.append(j);
        }
        return sb.toString();
    }
}