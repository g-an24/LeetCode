class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        //arr[n-1] = -1;
        int max = -1;
        
        for(int i=n-1; i>=0; i--){
            int t = arr[i];
            arr[i] = max;
            max = Math.max(max, t);
            
        }
        return arr;
        
    }
}