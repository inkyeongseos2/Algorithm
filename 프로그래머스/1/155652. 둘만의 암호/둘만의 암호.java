class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            char check = s.charAt(i);
            // System.out.println(check);
            for(int j = 0; j < index; j++){
                check +=1;
                if(check > 'z'){
                    check -= 26;       // z이후 a로 돌아감
                }
                
                if(skip.contains(String.valueOf(check))){
                    j--;
                }
            }
            answer += check;
        }
        return answer;
    }
}