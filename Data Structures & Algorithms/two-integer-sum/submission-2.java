class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> unique = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int diff = target - nums[i];
            if(unique.containsKey(diff)){
                return new int[]{unique.get(diff),i};
            }
            unique.put(nums[i],i);

        
        }
     return new int[]{0}; 
    
        
    }
}
