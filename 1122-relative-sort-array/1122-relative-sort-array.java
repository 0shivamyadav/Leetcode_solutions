class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n1=arr1.length;
        int n2=arr2.length;
        int[] count = new int[1001];

        for(int i = 0; i < n1; i++) {
            count[arr1[i]]++;
        }

        int index = 0;
        for(int i = 0; i < n2; i++) {
            while(count[arr2[i]] > 0) {
                arr1[index] = arr2[i];
                index++;
                count[arr2[i]]--;
            }
        }

        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                arr1[index] = i;
                index++;
                count[i]--;
            }
        }
        return arr1;
    }
}