import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 5) {
            System.out.println("tiny");
        }
        else {
            System.out.println(n*n);
        }
    }
}