class Solution {
    record Item(int num, String s){};
    public String arrangeWords(String text) {
        String[] arr = text.split(" ");
        arr[0] = arr[0].toLowerCase();
        List<Item> list = new ArrayList<>();
        for(String str: arr){
            int len = str.length();
            list.add(new Item(len, str));
        }
        list.sort((a, b) -> Integer.compare(a.num, b.num));
        StringBuilder sb = new StringBuilder();
        for(Item i: list){
            sb.append(i.s).append(" ");
        }
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString().trim();
    }
}