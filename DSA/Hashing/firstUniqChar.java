
import java.util.HashMap;

class  firstUniqChar {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        
        // 1. Build the frequency map
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        
        // 2. Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (countMap.get(c) == 1) {
                return i;
            }
        }
        
        return -1;
    }


    ==================================================
SAMPLE INPUTS AND OUTPUTS (TEST CASES)
==================================================

Example 1: Unique letter at the very start
------------------------------------------
Sample Input:  s = "leetcode"
Sample Output: 0
Explanation:   'l' is the first character that does 
               not repeat, and its index is 0.

Example 2: Unique letter located in the middle
------------------------------------------
Sample Input:  s = "loveleetcode"
Sample Output: 2
Explanation:   'l' and 'o' repeat later. 'v' is the 
               first unique character at index 2.

Example 3: All characters have duplicates
------------------------------------------
Sample Input:  s = "aabb"
Sample Output: -1
Explanation:   Every single letter repeats, so there 
               is no unique character. Returns -1.
==================================================
