class Solution {
    public String arrangeWords(String text) {
        String []s = text.toLowerCase().split(" ");
        Arrays.sort(s, (a,b) ->  a.length() - b.length());
        String ans = String.join(" ", s);
        return Character.toUpperCase(ans.charAt(0)) + ans.substring(1);
    }
}