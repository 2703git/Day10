import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = scanner.nextLine();
        Main main = new Main();
        System.out.println("Sum: "+main.Pr2(s));
    }
}