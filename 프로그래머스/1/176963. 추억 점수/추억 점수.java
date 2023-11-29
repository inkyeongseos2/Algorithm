import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        
        for(int x= 0; x < name.length; x++){
            map.put(name[x],yearning[x]);
        }
        
        for(int i = 0; i < photo.length; i++){
            int sum = 0;
            for(int j = 0; j < photo[i].length; j++){
                if(map.containsKey(photo[i][j])){
                    sum += map.get(photo[i][j]);
                }
            }
            
            answer[i] = sum;
        }
        return answer;
    }
}