
import java.util.*;

// begin	target	words	return
// "hit"	"cog"	["hot", "dot", "dog", "lot", "log", "cog"]	4
// "hit"	"cog"	["hot", "dot", "dog", "lot", "log"]	0

class Solution {

    int[] visited;
    
   int bfs(int start, String[] words, String target){
        Queue<Integer> q = new LinkedList();
        q.add(start);
        visited[start]=1;
        while (!q.isEmpty()){
            int p=q.poll();
            if (words[p].equals(target)){
                return visited[p];
            }
            for (int i=0;i<words.length;i++){
                if (i==start) continue;
                if (diff1(words[i], words[p]) && visited[i]==0){
                    q.add(i);
                    visited[i]=visited[p]+1;
                }
            }
        
        }
        return -1;
    }

    boolean diff1(String a, String b){
        int n=0;
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)!=b.charAt(i)) n++;
        }
        if (n==1) return true;
        else return false;
    }
    
    public int solution(String begin, String target, String[] words) {

        int m=100000000;
        boolean tf=false;
        for (int i = 0; i < words.length; i++) {
            if (diff1(words[i], begin)) {
                visited = new int[words.length];
                int p= bfs(i, words,target);
                if (p!=-1&&p<m){
                    m=p;
                    tf=true;
                }
            }
        }
        if (!tf) return 0;
        return m;
    }
}