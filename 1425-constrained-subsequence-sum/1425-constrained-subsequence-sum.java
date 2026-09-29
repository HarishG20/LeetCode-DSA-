class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n];
        Deque<Integer> deque = new ArrayDeque<>();
        int ans = nums[0];
        for(int i = 0; i < n; i++){
            while(!deque.isEmpty() && deque.peekFirst() < i - k){
                deque.pollFirst();
            }
            if(deque.isEmpty()){
                dp[i] = nums[i];
            }else{
                dp[i] = nums[i] + Math.max(0, dp[deque.peekFirst()]);
            }
            ans = Math.max(ans, dp[i]);
            while(!deque.isEmpty() && dp[deque.peekLast()] <= dp[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        return ans;
    }
}
