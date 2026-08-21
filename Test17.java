import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        Main main = new Main();
        System.out.println(main.Pr17(str));
    }
}
