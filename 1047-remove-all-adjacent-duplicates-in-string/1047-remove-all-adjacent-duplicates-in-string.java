class Solution {
    public String removeDuplicates(String s) {
        int n=s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder r = new StringBuilder();
        int i = 0;
        while(i<n){
            if(!st.isEmpty() && st.peek()==s.charAt(i)) st.pop();
            else st.push(s.charAt(i));
            i++;
        }
        while(!st.isEmpty()){
            r.append(st.peek());
            st.pop();
        }
        return r.reverse().toString();
    }
}