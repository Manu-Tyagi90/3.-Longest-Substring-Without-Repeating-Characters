import java.util.*;
class Solution{
public static int longestSubstring(String str){
  int windowStart = 0, windowEnd = 0 ,maxLen = 0;
  HashMap<Character, Integer> map = new HashMap<>();
  while(str.length()>windowEnd) {
    char c = str.charAt(windowEnd);
    if(map.containsKey(c) && map.get(c)>=windowStart) {
      windowStart = map.get(c) + 1;
    }
    map.put(c,windowEnd);
    maxLen = Math.max(maxLen, windowEnd - windowStart + 1);
    windowEnd++;
    }
  return maxLen;
  }

  public static void main(String[] manu) {
    System.out.println(longestSubstring("abcdabca"));
  }
}
