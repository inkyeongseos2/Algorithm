import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < num; i++){
            String name = br.readLine();
            map.put(name, map.getOrDefault(name,0)+1);
            //System.out.println(map);
        }
        
        int max = 0;
        for(String key : map.keySet()){
            max = Math.max(max,map.get(key));
        }
        
        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);
        
        for(String s : list){
            if(max == map.get(s)){
                System.out.println(s);
                break;
            }
        }
    }
}