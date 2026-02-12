import java.util.*;

// n	computers	                        return
// 3	[[1, 1, 0], [1, 1, 0], [0, 0, 1]]	2
// 3	[[1, 1, 0], [1, 1, 1], [0, 1, 1]]	1

class Solution {
    boolean[] visited;
    int nn;
    void dfs(int start, int size,int[][] computers){
        visited[start]=true;
        for (int i=0;i<size;i++){
            if (i!=start){
                if (visited[i]==false && computers[start][i]==1){
                    dfs(i, size,computers);
                }
            }
            
        }
    }

    public int solution(int n, int[][] computers) {
        visited=new boolean[n];
        nn=0;

        for (int i=0;i<n;i++){
            if (visited[i]==false){
                dfs(i,n,computers);
                nn++;
                
            }
            
            // System.out.println(nn);
        }


        int answer = 0;
        return nn;
    }
}