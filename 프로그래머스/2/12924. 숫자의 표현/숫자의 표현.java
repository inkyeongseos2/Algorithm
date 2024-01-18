class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n; i++){
            int sum = 0;        //합계 초기화
            for(int j = i; j <= n; j++){
                sum += j;
                if(sum == n){
                    // System.out.println(sum);
                    answer++;
                    break;
                }else if(sum > n){
                    break;
                }
            }
        }
        
        return answer;  
    }
}