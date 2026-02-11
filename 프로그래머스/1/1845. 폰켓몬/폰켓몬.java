import java.util.*;

class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> nn=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            nn.put(nums[i], nn.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length/2;
        int mn=nn.size();
        if (mn>=n){
            return n;
        }else{
            return mn;
        }
        
    }
}