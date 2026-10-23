class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n1=s.length();
        int n2=words.size();
        if(n1!=n2) return false;
        for(int i=0;i<n2;i++){
            if(s.charAt(i)!=words.get(i).charAt(0)) return false;
        }
        return true;
    }
}