import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] num1 = new int[N];        //스테이지별 도전자 수 
        int[] num2 = new int[N];        //스테이지별 아직 클리어 못한 도전자 수 
        
        //1. 스테이지별로 도전한 사람
        for(int num : stages){
            if(num > N) num = N;
            for(int i = 0; i < num; i++){
                num1[i]++;
            }
        }
        
        //2. 스테이지별 아직 클리어 못 한 도전자 수
        for(int ch : stages){
            if(ch <= N){
                num2[ch-1]++;
            }
        }
        
        //3.실패율 저장
        List<double[]> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            if(num1[i] == 0){
                list.add(new double[]{i+1, 0});
            }else{
                list.add(new double[]{i+1, (double)num2[i]/num1[i]});
            }
        }
        
        //4. 내림차순
        Collections.sort(list,(a,b) -> {
           if(a[1] == b[1]) return Double.compare(a[0],b[0]);
            return Double.compare(b[1],a[1]);
        });
        
        for(int i = 0; i < N; i++){
            answer[i] = (int)list.get(i)[0];
        }
        // for(int i = 0; i < num2.length; i++){
        //     System.out.print(num2[i]);
        // }
        return answer;
    }
}