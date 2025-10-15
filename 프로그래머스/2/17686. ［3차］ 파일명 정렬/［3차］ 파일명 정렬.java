import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = {};
        
        Arrays.sort(files,(a,b) ->{
            String[] ch1 = check(a);
            String[] ch2 = check(b);
            
            int headcompare = ch1[0].toLowerCase().compareTo(ch2[0].toLowerCase());
            if(headcompare != 0) return headcompare;
            
            int num1 = Integer.parseInt(ch1[1]);
            int num2 = Integer.parseInt(ch2[1]);
            return num1- num2;
            
        });
        return files;
    }
    
    public String[] check(String s){
        String head = "";
        String num = "";
        int i = 0;
        
        //숫자 나오기 직전까지 head로 저장
        while(i < s.length() && !Character.isDigit(s.charAt(i))){
            head += s.charAt(i);
            i++;
        }
            
       while(i < s.length() && Character.isDigit(s.charAt(i))){
            num += s.charAt(i);
            i++;
        }   
        
        
        return new String[]{head,num}; 
    }
}