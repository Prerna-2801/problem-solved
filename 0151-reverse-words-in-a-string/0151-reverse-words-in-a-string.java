class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int n = arr.length;
        int i = 0, j = n-1;
        while(i<j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return String.join(" ",arr);
    }
}