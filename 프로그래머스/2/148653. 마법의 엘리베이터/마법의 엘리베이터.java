class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while(storey > 0){
            int ch = storey % 10;
            
            if(ch == 5){
                //끝 자리가 5인경우 앞자리 비교
                if((storey / 10) % 10 >= 5){
                    answer += (10-ch);
                    storey = storey / 10 + 1;
                }else{
                    answer += ch;
                    storey = storey / 10;
                }
            }else if(ch < 5){
                //1~4는 빼는게 빠름
                answer += ch;
                storey = storey / 10;
            }else{
                //6~9는 더하는게 빠름
                answer += (10-ch);
                storey = storey / 10 + 1;
            }
            
        }
        
        return answer;
    }
}