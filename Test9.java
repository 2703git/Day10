import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first cathetus: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second cathetus: ");
        double b = scanner.nextDouble();
        Main main = new Main();
        main.Pr9(a, b);
    }
}
