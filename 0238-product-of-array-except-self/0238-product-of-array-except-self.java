// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n=nums.length;
//         int ans[]=new int[n];
//         for(int i=0;i<n;i++){
//             int multi=1;
//             for(int j=0;j<n;j++){
//                 if(i!=j){
//                    multi*=nums[j];
//                 }
//             }
//             ans[i]=multi;
//         }
//         return ans;
//     }
// }

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = 1;
        }
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] *= left;
            left *= nums[i];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }
        return output;        
    }
}