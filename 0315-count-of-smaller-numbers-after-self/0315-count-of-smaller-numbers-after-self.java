// class Solution {
//     public List<Integer> countSmaller(int[] nums) {
//         int n=nums.length;
//         //List<Integer> ans=new ArrayList<>(;)
//         int ans[]=new int [n];

//         for(int i=0;i<n;i++){
//             int count=0;
//             for(int j=i;j<n;j++){
//                 if(nums[i]>nums[j]){
//                     count++;
//                 }
//                 ans[i]=count; 
//             }
//         }
//         List<Integer> list=new ArrayList<>();

//         for(int i=0;i<n;i++){
//             list.add(ans[i]);
//         }
//         return list;
//     }
// }

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            int low = 0;
            int high = list.size();
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (list.get(mid) < nums[i]) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            ans.add(low);
            list.add(low, nums[i]);
        }
        Collections.reverse(ans);
        return ans;
    }
}