import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        Map<String,Integer> inTime = new HashMap<>();
        Map<String,Integer> total = new HashMap<>();
        
        for(String record : records){
            String[] parts = record.split(" ");
            String time = parts[0];
            String car = parts[1];
            String type = parts[2];
            
            //분으로 바꾸기
            String [] t = time.split(":");
            int minute = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
            
            if(type.equals("IN")){
                inTime.put(car,minute);
            }else{ //out이면
                int in = inTime.get(car);
                int diff = minute - in;
                total.put(car,total.getOrDefault(car,0) + diff);
                inTime.remove(car); //출차한 차량 빼기
            }
        }
        
        for(String car : inTime.keySet()){
            int time = 23*60 + 59;  // 23:59 분으로 구하기
            int diff = time - inTime.get(car);
            total.put(car,total.getOrDefault(car,0)+diff);
        }
        
        List<String> list = new ArrayList<>();
        for(String s : total.keySet()){
            list.add(s);
        }
        Collections.sort(list);
        
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            int time = total.get(list.get(i));
            answer[i] = calcFee(time, fees);
        }
        return answer;
    }
    
    private int calcFee(int time, int[] fees){
        int basicTime = fees[0];
        int basicFee = fees[1];
        int unitTime = fees[2];
        int unitFee = fees[3];
        
        if(time < basicTime){
            return basicFee;
        }else{
            double extra = time - basicTime;
            return basicFee + (int)Math.ceil(extra/unitTime) * unitFee;
        }
    }
}