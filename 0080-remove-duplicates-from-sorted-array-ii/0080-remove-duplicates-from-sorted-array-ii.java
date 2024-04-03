class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int new_index = 1;
        
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            
            else{
                count = 1;
            }
            
            if(count <=2){
                nums[new_index++] = nums[i];
            }
        }
        return new_index;
        
    }
}