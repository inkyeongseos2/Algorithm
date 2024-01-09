import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int first = Integer.parseInt(st.nextToken());
        
        for(int i = 1; i < N; i++){
            int ch = Integer.parseInt(st.nextToken());
            
            int gcd = gcd(first, ch);
            
            System.out.println((first / gcd) + "/" + (ch/gcd));
        }
        
    }
    
    public static int gcd(int a, int b){
        int r = 0;
        while(b != 0){
            r = a % b;
            a = b;
            b = r;
        }
        //최대공약수
        return a;
    }
}