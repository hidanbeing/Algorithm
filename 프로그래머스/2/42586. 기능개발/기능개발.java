import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        int k=0;
        int t=0;
        while (t<progresses.length){
        for (int i=0;i<progresses.length;i++){
            progresses[i]+=speeds[i];
        }
        int tmpt=t;
        for (int i=t;i<progresses.length;i++){
            if (progresses[t]>=100){
                //System.out.println(t);
                t++;
                if (t>=progresses.length){
                    break;
                }
            }
        }
        if (t-tmpt!=0){
            answer.add(t-tmpt);
        }            
        }
       int[] ans = new int[answer.size()];
        for (int i=0;i<answer.size();i++){
            ans[i]=answer.get(i);
        }
        return ans;
        
    }
}