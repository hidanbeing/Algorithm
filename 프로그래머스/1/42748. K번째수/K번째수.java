import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] tt= array;
        for (int i=0;i<commands.length;i++){
            array=tt;
            int [] tmp = Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);
            // System.out.println(tmp[0]);
            Arrays.sort(tmp);
            // System.out.println(tmp[0]);
            answer[i]=tmp[commands[i][2]-1];
        }
        return answer;
    }
}