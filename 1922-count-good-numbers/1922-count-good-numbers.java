class Solution {
    static long mod = 1000000007;
    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long a = power(5, even);
        long b = power(4, odd);
        return (int)((a * b) % mod);
    }
    public long power(long a, long b) {
        long ans = 1;
        while(b > 0) {
            if(b % 2 == 1) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            b = b / 2;
        }
        return ans;
    }
}