class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right;
        int n = nums.length;
        
        for(right=0; right<n; right++){
            if(nums[right]==0){
                k--;
            }
            
            if(k<0){
                k = k + 1 - nums[left];
                left++;
            }
        }
        return right-left;
        
    }
}