import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        //1.첫번째배열 이진수로 변환
        List<String> list1 = new LinkedList<>();
        for(int a : arr1){
            String s = calc(a, n);
            list1.add(s);
        }
        
        //2.두번째 배열 이진수로 변환
        List<String> list2 = new LinkedList<>();
        for(int a : arr2){
            String s = calc(a, n);
            list2.add(s);
        }
        
        String[][] total = new String[n][n];
        //3.첫번째 배열부터 표시
        for(int i = 0; i < list1.size(); i++){
            String s = list1.get(i);
            for(int j = 0; j < s.length(); j++){
                Character c = s.charAt(j);
                
                if(c == '1'){
                    total[i][j] = "#";
                }
            }
        }
        
        //4.두번째 배열부터 표시
        for(int i = 0; i < list2.size(); i++){
            String s = list2.get(i);
            for(int j = 0; j < s.length(); j++){
                Character c = s.charAt(j);
                
                if(c == '1'){
                    total[i][j] = "#";
                }
            }
        }
        for(int x = 0; x < n; x++){
            StringBuilder sb2 = new StringBuilder();
            for(int y = 0; y < n; y++){
                if(total[x][y] == "#"){
                    sb2.append("#");
                }else{
                    sb2.append(" ");
                }
            }
            answer[x] = sb2.toString();
        }
        
        return answer;
    }
    
    private String calc(int num, int n){
        StringBuilder sb = new StringBuilder();
        
        while(num >= 1){
            int pre = num / 2;
            int next = num % 2;
            
            num = pre;
            if(next == 1){
                sb.append("1");
            }else{
                sb.append("0");
            }
        }
        
        
        if(sb.length() < n){
            int add = n- sb.length();
            for(int i = 0; i < add; i++){
                sb.append("0");
            }
        }
        // System.out.println(sb);
        // System.out.println(sb.reverse());
        
        return sb.reverse().toString();
    }
}