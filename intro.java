import java.util.Arrays;
public class intro {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 1, 3, 4, 2, 9, 7};
        partition(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    private static void partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int indexS = right - 1;
        int indexB = left;

        while(indexS > indexB){
            while(arr[indexS] >= pivot){
                indexS--;
            }
            while(arr[indexB] <= pivot) {
                indexB++;
            }
           swap(arr, indexS, indexB);
        }
        swap(arr, indexS, right);
        if(indexS - 1 - (left) + 1 > 1){
            partition(arr, left, indexS - 1);
        }
        if(right - (indexS + 1) + 1 > 1){
            partition(arr, indexS + 1, right);
        }
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}