import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int count = 1;
        List<String> pwords = new ArrayList<>();
        
        String preCh = words[0]; //첫번째 단어
        pwords.add(preCh);
        
        for(int i = 1; i < words.length; i++){

            String nextCh = words[i];
            if(preCh.charAt(preCh.length()-1) != nextCh.charAt(0)
              || pwords.contains(nextCh)){
                break;
            }else{
                count++;
                preCh = nextCh;
                pwords.add(nextCh);
            }
        }
        
        if(count == words.length){
            answer[0] = 0;
            answer[1] = 0;
        }else{
            answer[0] = count % n +1;
            answer[1] = count / n +1;
        }
        
        
        return answer;
    }
}