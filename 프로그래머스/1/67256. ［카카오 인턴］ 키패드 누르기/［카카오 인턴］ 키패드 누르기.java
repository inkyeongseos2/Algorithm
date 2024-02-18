import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        //손가락 시작하는 위치 셋팅
        int left = 10;
        int right = 12;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numbers.length; i++){
            
            // System.out.println(i);
            int chNum = numbers[i];
            
            if(chNum == 1 || chNum == 4 || chNum == 7){
                sb.append("L");
                left  = chNum;
            }else if(chNum == 3 || chNum == 6 || chNum == 9){
                sb.append("R");
                right  = chNum;
            }else{
                if(chNum == 0) chNum = 11;  //0은 위치로 11임
                
                //아래로 이동 거리는 Math.abs(chNum - left) / 3
                //옆으로 이동 거리는 Math.abs(chNum - left) % 3
                int lnum = Math.abs(chNum - left) / 3 + Math.abs(chNum - left) % 3;
                int rnum = Math.abs(chNum - right) / 3 + Math.abs(chNum - right) % 3;
                
                if(lnum == rnum){
                    if(hand.equals("right")){
                        sb.append("R");
                        right = chNum;
                    }else{
                        sb.append("L");
                        left = chNum;
                    }
                }else if(lnum < rnum){
                    sb.append("L");
                    left = chNum;
                }else{
                    sb.append("R");
                    right = chNum;
                }
                
            }
            
            // System.out.println(sb);
            
        }
        return sb.toString();
    }
}