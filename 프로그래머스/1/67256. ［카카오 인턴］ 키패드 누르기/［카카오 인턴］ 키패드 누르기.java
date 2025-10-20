class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        
        //왼손,오른손 시작 위치
        int left = 10;
        int right = 12;
        
        for(int n : numbers){
            if(n == 1  || n == 4 || n == 7){
                sb.append("L");
                left = n;
            }else if(n == 3  || n == 6 || n == 9){
                sb.append("R");
                right = n;
            }else{
                if(n == 0) n = 11;
                
                int leftDist = Math.abs(n - left)/3 + Math.abs(n-left)%3;
                int rightDist = Math.abs(n - right)/3 + Math.abs(n-right)%3;
            
                if(leftDist < rightDist){
                    sb.append("L");
                    left = n;
                }else if(leftDist > rightDist){
                    sb.append("R");
                    right = n;
                }else{
                    if(hand.equals("left")){
                        sb.append("L");
                        left = n;
                    }else{
                        sb.append("R");
                        right = n;
                    }
                }
            }
            
        }
        return sb.toString();
    }
}