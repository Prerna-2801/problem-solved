class Solution {
    public int sumOfPrimesInRange(int n) {
        int r = reverseN(n);
        int min = Math.min(n, r);
        int max = Math.max(n, r);
        int sum = 0;
        for(int i = min; i<=max; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
    public int reverseN(int n){
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        return Integer.valueOf(sb.toString());
    }
    public boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i*i <=n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}