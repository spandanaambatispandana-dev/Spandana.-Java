import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Area of Circle = " + area);

        sc.close();
    }
}

Example
Enter radius: 5
Area of Circle = 78.53981633974483


You can also write the calculation simply as:

double area = Math.PI * radius * radius;
