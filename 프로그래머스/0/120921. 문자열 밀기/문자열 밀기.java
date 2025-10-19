class Solution {
    public int solution(String A, String B) {
         if(A.equals(B)) return 0;
        
        String str = A;
        int count = 0;
        
        while(count < A.length()){
            count++;
            
            str = str.charAt(str.length()-1) + str.substring(0,str.length()-1);   
            
            if(str.equals(B)) return count;
        }
        
        return -1;
    }
}