import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));
        
        //문자열 이어붙이기
        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s);
        }
        
        if(sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}