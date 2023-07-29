package employeewagecomputation;
import java.util.Scanner;
public class LineComparison {
    private static final double EPSILON = 0.00000001;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start point of the first line (x, y): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Enter the end point of the first line (x, y): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        System.out.println("Enter the start point of the second line (x, y): ");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();
        System.out.println("Enter the end point of the second line (x, y): ");
        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double length2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        boolean equal = Math.abs(length1 - length2) < EPSILON;

        boolean greater = length1 > length2;

        boolean less = length1 < length2;

        System.out.println("Are the two lines equal? " + equal);
        System.out.println("Is the first line greater than the second line? " + greater);
        System.out.println("Is the first line less than the second line? " + less);
    }
}
