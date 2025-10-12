class Solution {
    public int solution(String s) {
        int answer = 0;
        int startnum = 0;
        
        while(startnum < s.length()){
            char x = s.charAt(startnum);
            int xnum = 0;   //x의 갯수
            int ynum = 0;   //x외 갯수
    
            for(int i = startnum; i <s.length(); i++){
                if(x == s.charAt(i)){
                    xnum++;
                }else{
                    ynum++;
                }
                if(xnum == ynum){
                    answer = answer +1;
                    startnum = i+1;
                    break;
                } 
                
                if(i == s.length() -1){
                    answer++;
                    startnum = s.length();
                }
            }
            
        }
        return answer;
    }
}