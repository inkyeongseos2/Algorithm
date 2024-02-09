import java.util.*;

class Solution {
    
    //1.모음 선언
    static String[] arr = new String[]{"A","E","I","O","U"};
    static List<String> list = new ArrayList<>();
    
    public int solution(String word) {
        int answer = 0;
        
        recursion("", 0);
           
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).equals(word)){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
    
    static void recursion(String str, int depth){
        //1.문자 리스트에 저장
        list.add(str);
        
        //2.최대 길이 5임(depth 0부터 시작 함)
        if(depth == 5) return;
        
        for(int i = 0; i < arr.length; i++){
            recursion(str+arr[i], depth +1);
        }
    }
}