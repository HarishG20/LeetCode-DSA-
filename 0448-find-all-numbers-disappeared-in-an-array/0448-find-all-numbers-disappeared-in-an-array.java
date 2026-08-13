class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] seen= new boolean[n + 1];
        for(int i = 0; i < n; i++){
            seen[nums[i]]= true;
        }
        List<Integer> result= new ArrayList<>();
        for(int num=1; num<=n; num++) {
            if(!seen[num]) {
                result.add(num);
            }
        }
        return result;
    }
}