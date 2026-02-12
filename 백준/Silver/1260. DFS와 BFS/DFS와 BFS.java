import java.util.*;

public class Main {


    static List<Integer>[] graph;
    static boolean[] visited;

    static void dfs(int idx){
        // 재귀
        visited[idx]=true;
        System.out.printf("%d ",idx);
        for (int i=0;i<graph[idx].size();i++){
            if (visited[graph[idx].get(i)]==false){
                dfs(graph[idx].get(i));
            }
        }
    }
    
    static void bfs(int idx){
        // 큐
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        visited[idx]=true;
        while (!q.isEmpty()){
            int p = q.poll();
            System.out.printf("%d ",p);
            for (int i=0;i<graph[p].size();i++){
                if (visited[graph[p].get(i)]==false){
                    q.add(graph[p].get(i));
                    visited[graph[p].get(i)]=true;
                }
            }
        }

    }
            
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 4
        int m = sc.nextInt();   // 5
        int start = sc.nextInt(); // 1

        graph = new ArrayList[n+1];
        
        
        for (int i = 0; i <= n; i++) {
            graph[i]= new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 0; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        visited = new boolean[n+1];
        dfs(start);
        System.out.println();
        visited = new boolean[n+1];
        bfs(start);

        sc.close();
    }

}