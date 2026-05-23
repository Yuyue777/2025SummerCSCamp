class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = nums.length + 1;
        for (int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum = sum + nums[j];
                if(sum >= target){
                    int currentLength = j - i + 1;
                    if(currentLength < minLength){
                        minLength = currentLength;
                    }
                    break;
                }
            }
        }
        if(minLength == nums.length + 1){
            return 0;
        }else{
            return minLength;
        }
    }
}