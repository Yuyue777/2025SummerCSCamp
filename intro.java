import java.util.Scanner;
public class intro {
    public static void main() {
        int[] result = new int[2];
        Scanner scanner = new Scanner(System.in); // 从控制台读取
        int[] nums = new int[5];



        for (int i = 0; i <= 4; i++) {
            int num = scanner.nextInt();
            nums[i] = num;
        }

        System.out.println("Input target");
        int target = scanner.nextInt();
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            while (j <= nums.length - 1) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    System.out.println(result[0] + ", " + result[1]);
                }
             j++;
            }
            if (result[0] != 0 && result[1] != 0){
                break;
            }
        }

    }
}