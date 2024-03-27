// class Solution {
//     public int[] getConcatenation(int[] nums) {
//         int n = nums.length;
        
//         int[] num_new = new int[2*n];
        
//         for(int i=nums.length; i<num_new.length; i++){
//             num_new[i-nums.length] = nums[i-nums.length];
//             num_new[i] = nums[i-nums.length];
//         }
        
//         return num_new;
        
//     }
// }

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i=0;i<nums.length;i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}