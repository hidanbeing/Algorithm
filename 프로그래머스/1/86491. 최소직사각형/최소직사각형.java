
import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
    	int m=sizes.length;
    	
    	for (int i=0;i<m;i++) {
    		Arrays.sort(sizes[i]);
    	}
    	int mi=-1;
    	int ma=-1;
    	
    	for (int i=0;i<m;i++) {
    		if (sizes[i][0]>mi) {mi=sizes[i][0];}
    		if (sizes[i][1]>ma) {ma=sizes[i][1];}
    	}
    	System.out.println(mi);
        System.out.println(ma);
        return mi*ma;
    }
}