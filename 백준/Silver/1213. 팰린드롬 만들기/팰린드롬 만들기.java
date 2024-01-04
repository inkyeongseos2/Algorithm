import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String answer = "";
        int[] ch = new int[26];       //알파벳 크기 배열 생성
        
        for(int i = 0; i < input.length(); i++){
            ch[input.charAt(i) - 'A']++; //알파벳 개수 
        }
        
        int num = 0; //홀수 개수
        for(int i = 0; i < ch.length; i++){
            if(ch[i] % 2 != 0){
                num++;
            }
        }
        
        
        if(num > 1){
            System.out.println("I'm Sorry Hansoo");  //알파벳 개수가 홀수인게 1개 이상인 경우
            return;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < ch.length; i++){
            for(int j = 0; j < ch[i]/2 ; j++){//값이 있으면 짝수인거임
                sb.append((char)(i+65));
            }
        }
        answer += sb.toString();
        String reanswer = sb.reverse().toString();
            
        sb = new StringBuilder();    //초기화
        for(int i = 0; i < ch.length; i++){
            if(ch[i]%2 == 1){
                sb.append((char)(i+65));
            }
        }
        
        answer += sb.toString() + reanswer;
        System.out.println(answer);
    }
}