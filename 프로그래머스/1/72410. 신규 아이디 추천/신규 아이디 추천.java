class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        //1.모든 대문자를 소문자로 치환
        answer = new_id.toLowerCase();
        
        //2.소문자,숫자
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < answer.length(); i++){
            char c = answer.charAt(i);
            if(Character.isDigit(c)
              || Character.isLetter(c)
              || (c == '-' || c == '_' || c == '.')){
                sb.append(c);
            }
        }
        answer = sb.toString();
        
        //3.마침표 2번 이상이면 하나로 치환
        while(answer.contains("..")){
            answer = answer.replace("..",".");
        }
        
        //4.마침표 처음 마지막
        if(answer.length() > 0 && answer.charAt(0) == '.'){
            answer = answer.substring(1);
        }
        if(answer.length() > 0 && answer.charAt(answer.length()-1) == '.'){
            answer = answer.substring(0,answer.length()-1);
        }
        
        //5.빈문자열이면 "a"대입
        if(answer.isEmpty()){
            answer = "a";
        }
        
        //6.자리 이상이면 15자까지 자르기, 끝이 .이면 제거
        if(answer.length() > 15){
            answer = answer.substring(0,15);
            if(answer.charAt(14) == '.'){
                answer = answer.substring(0,14);
            }
        }
        
        //7. 길이가 2 이하이면 마지막 문자 반복
        while(answer.length() <=2){
            answer += answer.charAt(answer.length()-1);
        }
        return answer;
    }
}