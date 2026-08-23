class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol = (long) length*width*height;
        if((length >= 1e4 || width >= 1e4 || height >= 1e4 || vol >= 1e9) && mass < 100){
            return "Bulky";
        }
        if((length < 1e4 && width < 1e4 && height < 1e4 && vol < 1e9) && mass >= 100){
            return "Heavy";
        }
        if((length < 1e4 && width < 1e4 && height < 1e4 && vol < 1e9) && mass < 100){
            return "Neither";
        }
        if((length >= 1e4 || width >= 1e4 || height >= 1e4 || vol >= 1e9) && mass >= 100){
            return "Both";
        }
        return "";
    }
}