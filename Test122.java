import java.util.Scanner;

public class Test122 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter S: ");
        int s = scanner.nextInt();
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        Main main = new Main();
        System.out.println(main.Pr122(s, n));
    }
}
