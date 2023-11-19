import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String[] data = sc.nextLine().split("-");
        int sum = Integer.MAX_VALUE;
        
        for(int i = 0; i < data.length; i++){
            String[] plusdata = data[i].split("\\+");
            
            int num = 0;
            for(int j = 0; j < plusdata.length; j++){
                num += Integer.parseInt(plusdata[j]);  
            }
            
            if(sum == Integer.MAX_VALUE){
                sum = num;
            }else{
                sum -= num;
            }
        }
        System.out.println(sum);
    }
}