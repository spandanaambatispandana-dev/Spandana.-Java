import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        System.out.println("Enter " + n + " numbers:");

        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            sum += num;
        }

        double average = (double) sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}
