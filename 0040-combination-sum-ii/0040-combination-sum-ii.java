class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> arr=new ArrayList<>();
        combination(0,candidates,target,new ArrayList<>(), arr);
        return arr;
    }
    public void combination(int index,int[] candidates,int t,List<Integer> ans,List<List<Integer>> arr){
        if(t==0){
            arr.add(new ArrayList<>(ans));
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;

            if(candidates[i]>t) break;

            ans.add(candidates[i]);
            combination(i+1,candidates,t-candidates[i],ans,arr);
            ans.remove(ans.size()-1);
        }
    }
}