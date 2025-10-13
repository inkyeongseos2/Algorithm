class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(c == ' '){
                sb.append(' ');
                idx = 0;
            }else{
                if(idx % 2 == 0){
                    sb.append(String.valueOf(c).toUpperCase());
                }else{
                    sb.append(String.valueOf(c).toLowerCase());
                }
                
                idx++;
            }
        }
        return sb.toString();
    }
}