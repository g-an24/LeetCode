class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        
        int[] num_new = new int[2*n];
        
        for(int i=nums.length; i<num_new.length; i++){
            num_new[i-nums.length] = nums[i-nums.length];
            num_new[i] = nums[i-nums.length];
        }
        
        return num_new;
        
    }
}