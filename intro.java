import java.util.Scanner;
public class intro {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in); // 从控制台读取
        int total = 0;
        int i;
        for (i = 0; i <= 3; i++){
            int num = scanner.nextInt();
            total = total + num;
        }

        System.out.println("The total is" + ": "+ total);

    }
}