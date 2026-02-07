
class Solution {
    public int rob(int[] nums) {
        int[] arr = new int[n];
        arr[0] = nums[0];
        if(nums[1] < arr[0]) {
            arr[1] = arr[0];
        }
        int MaxValue = arr[1];
        for (int i = 2; i < nums.length; i++) {
            arr[i] = nums[i] + arr[i-2];
            if(arr[i] < MaxValue){
                arr[i] = MaxValue;
            }else{
                MaxValue = arr[i];
            }
        }
        return MaxValue;
    }
}
