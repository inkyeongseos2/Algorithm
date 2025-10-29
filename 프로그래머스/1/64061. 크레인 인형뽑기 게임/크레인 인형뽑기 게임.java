import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int n = board.length;       //행
        int m = board[0].length;    //열
        
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < moves.length; i++){
            int num = moves[i]-1;
            for(int j = 0; j < n; j++){
                if(board[j][num] != 0){
                    if(stack.isEmpty()){
                        stack.push(board[j][num]);
                    }else{
                        if(stack.peek() == board[j][num]){
                            stack.pop();
                            answer += 2;
                        }else{
                            stack.push(board[j][num]);
                        }
                    }
                    board[j][num] = 0;
                    break;
                }
            }                
        }
        
        
        return answer;
    }
}