class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
        int n = nums.length;
        int j = 0;
        for(int i = 0; i<n; i++){
            ans[j] = nums[i];
            ans[j+n] = nums[i];
            j = j + 1;

        }
        return ans;
        
    }
}