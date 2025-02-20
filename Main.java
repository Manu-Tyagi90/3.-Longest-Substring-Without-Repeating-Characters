public class Main {
private static int lengthOfLongestSubstring(String s) {
char arr[] = s.toCharArray();
int start = 0;
int end =0;
int max = 0;
Map<Character, Integer> map = new HashMap<>();
for(end =0;end<arr.length;end++){
if(map.containsKey(arr[end]) && map.get(arr[end]) >= start) {
start = map.get(arr[end]) + 1;
}
map.put(arr[end], end);
max = Math.max(max, end - start + 1);
}
return max;
}
}
