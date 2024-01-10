import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];
        
        dp[0] = 1;
        dp[1] = 1;
        
        for(int i = 2; i <=n; i++){
            //n은 최대 1000
            //값이 커지면 오버플로우 발생하므로 미리 10007 나누어 저장
            //괄호 주의
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }   
        
        System.out.println(dp[n]);
    }
}