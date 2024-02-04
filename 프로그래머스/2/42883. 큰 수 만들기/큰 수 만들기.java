class Solution {
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        int index = 0;      //기준이 되는 위치
        for(int i = 0; i < number.length() -k; i++){
            int max = 0;
            for(int j = index; j <= k + i; j++){
                if(number.charAt(j) - '0' > max){
                    max = number.charAt(j) - '0';
                    index = j +1;
                }
            }
            
            sb.append(max);
        }
        return sb.toString();
    }
}