class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int len = stack.length();
            if(len > 0 && stack.charAt(len - 1) == ch){
                stack.deleteCharAt(len - 1);
            } else {
                stack.append(ch);
            }
        }
        return stack.toString();
    }
}