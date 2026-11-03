class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (citations[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}
                
                // My code

// class Solution {
//     public int hIndex(int[] citations) {
//         Arrays.sort(citations);
//         int n=citations.length;
//         int h=0;
//         for(int i=0;i<n;i++){
//             int count1=0;
//             for(int j=i;j<n;j++){
//                 if(citations[i]<=citations[j]) count1++;
//                 if(citations[i]==count1){
//                     h=count1;
//                     break;
//                 }
//             }
//         }
//         return h;
//     }
// }