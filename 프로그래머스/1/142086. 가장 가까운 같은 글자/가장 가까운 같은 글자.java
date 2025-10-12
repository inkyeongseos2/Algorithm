class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        for(int i = 1; i < s.length(); i++){
            char c = s.charAt(i);
            int num = -1;
            for(int j = 0; j < i; j++){
                if(c == s.charAt(j)){
                   num = j; 
                }
            }
            if(num == -1){
                answer[i] = -1;
            }else{
                answer[i] = i - num;
            }
        }
        return answer;
    }
}