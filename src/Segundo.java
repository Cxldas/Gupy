import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int number = scanner.nextInt();

        if (isFibonacci(number)) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1, next = 0;

        if (n == 0 || n == 1) {
            return true;
        }

        while (next < n) {
            next = a + b;
            a = b;
            b = next;
        }

        return next == n;
    }
}
