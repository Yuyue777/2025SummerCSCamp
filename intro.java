
class Solution {
    public int lengthOfLongestSubstring(String A){
        int left = 0;
        int n = A.length();
        int right = left;
        int result = 0;
        Set<character> dic = new HashSet<character>();
        while (right < n){
            char a = A.charAt(right);
            if(dic.contains(a)) {
                result = Math.max(right - left, result);
                while(dic.contains(A.charAt(left)){
                    dic.remove(A.charAt(left));
                    left++;
                }
                dic.add(a);
                right++;
            }else{
                right++;
                dic.add(a);
            }

        }
        return result;
    }
}
