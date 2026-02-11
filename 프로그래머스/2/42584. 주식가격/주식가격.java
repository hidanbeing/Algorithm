class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for (int i=0;i<prices.length-1;i++){
            int k=prices.length-1-i;
            for (int j=i+1;j<prices.length;j++){
                if (prices[i]>prices[j]){
                    k=j-i;
                    break;
                }
            }
            //System.out.println(k);
            answer[i]=k;
        }
        answer[prices.length-1]=0;
        return answer;
    }
}