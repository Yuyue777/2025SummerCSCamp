class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
     int left = 0;
     int right = x;

     while(right - left > 1){
         int mid = x/2;
         if(mid * mid > x){
             right = mid;
         }else if(mid * mid < x){
             left = mid;
         }else{
             return mid;
         }
     }
     return (right + left) / 2;
    }
}