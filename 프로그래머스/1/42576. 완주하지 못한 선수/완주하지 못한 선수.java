import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> pp = new HashMap<>();
        
        for (String str: participant){
            pp.put(str, pp.getOrDefault(str,0)+1);
        }
        
        for (String str: completion){
            pp.put(str, pp.get(str)-1);
        }
        
        String answer = "";
        
        for (String str: participant){
            if (pp.get(str)!=0) answer=str;
        }
        
        return answer;
    }
}