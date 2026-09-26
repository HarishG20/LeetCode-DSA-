class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()){
            return false;
        }
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];
        for(char c : s1.toCharArray()){
            s1Count[c - 'a']++;
        }
        int k = s1.length();
        for(int i = 0; i < k; i++){
            windowCount[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(s1Count, windowCount)){
            return true;
        }
        for(int i = k; i < s2.length(); i++){
            windowCount[s2.charAt(i) - 'a']++;
            windowCount[s2.charAt(i - k) - 'a']--;
            if(Arrays.equals(s1Count, windowCount)){
                return true;
            }
        }
        return false;
    }
}