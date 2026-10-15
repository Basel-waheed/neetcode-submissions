class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groups = new ArrayList<>();
        boolean[] used = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (used[i]) {
                continue;
            }
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            used[i] = true;
            for (int j = (i + 1); j < strs.length; j++) {
                if (!used[j] && isAnagram(strs[i], strs[j]) == true) {
                    group.add(strs[j]);
                    used[j] = true;
                };
            };
            groups.add(group);
        };
        return groups;
    };
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        };
        if (s.equalsIgnoreCase(t)) {
            return true;
        };
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (counts[i] != 0) {
                return false;
            }
        }
        return true;
    }
};
