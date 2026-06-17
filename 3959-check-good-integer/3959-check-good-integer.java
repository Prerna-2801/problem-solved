class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum = 0;
        int num = n;
        while(n != 0){
            digitSum += n%10;
            n = n/10;
        }
        int sSum = 0;
        while(num != 0){
            int x = num%10;
            sSum += x*x;
            num = num/10;
        }
        if(sSum - digitSum >= 50) return true;
        return false;
    }
}