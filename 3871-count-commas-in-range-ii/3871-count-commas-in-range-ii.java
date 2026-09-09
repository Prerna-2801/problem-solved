class Solution {
    public long countCommas(long n) {
        long totalCommas = 0;
        long start = 1000; 
        long commasPerNumber = 1;
        while(n >= start){
            long nextTier = start * 1000;
            long end = Math.min(n, nextTier - 1);
            long countOfNumbers = end - start + 1;
            totalCommas += countOfNumbers * commasPerNumber;
            start = nextTier;
            commasPerNumber++;
        }
        return totalCommas;
    }
}