import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int answer = 0;
        
        int n = maps.length; //행 수
        int m = maps[0].length; //열 수 
    
        //방향
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        //거리
        int[][] dist = new int[n][m];
        dist[0][0] = 1;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        
        while(!queue.isEmpty()){
            int[] now = queue.poll(); //현재위치
            int x = now[0];
            int y = now[1];
            
            if( x == n-1 && y == m-1) return dist[x][y]; //도차하면 리턴
            
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                //인덱스 체크
                if(nx < 0 || ny < 0 || nx >=n || ny >= m) continue;
                
                if(maps[nx][ny] == 0) continue;
                
                //이미 방문했으면 패스
                if(dist[nx][ny] != 0) continue;
                
                dist[nx][ny] = dist[x][y] + 1;
                queue.add(new int[]{nx,ny});
            }
        }
        
        
        return -1;
    }
}