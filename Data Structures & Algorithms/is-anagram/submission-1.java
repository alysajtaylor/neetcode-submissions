
class Solution {
    public HashMap<Character, Integer> countChars(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char ch: str.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        return charCount;
    }
    
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        return countChars(s).equals(countChars(t));
    }
}
