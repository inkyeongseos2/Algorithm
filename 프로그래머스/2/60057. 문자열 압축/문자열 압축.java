import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = s.length();
        List<Integer> list = new ArrayList();
        
        for(int i = 1; i <= s.length()/2; i++){
            StringBuilder sb = new StringBuilder();
            int num = 1;
            String chbefore = s.substring(0,i);
           
            for(int j  = i; j < s.length(); j +=i){
                String chafter = s.substring(j,Math.min(j+i, s.length()));
                // System.out.println("chafter : " +chafter);
                if(chbefore.equals(chafter)){
                    num += 1;
                }else{
                    if(num > 1) sb.append(num);
                    
                    sb.append(chbefore);
                    chbefore = chafter;
                    num = 1;
                }
                // System.out.println(sb.toString());
            }
            
            if(num > 1) sb.append(num);        
            sb.append(chbefore);
                                             
            list.add(sb.length());
        }
        
        for (int len : list) {
            answer = Math.min(answer, len);
        }

        return answer;
    }
}