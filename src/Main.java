import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scanner.nextInt();

        if (fiboNacci(num)) {
            System.out.println(num + " Pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " Não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean fiboNacci(int num) {
        int a = 0, b = 1;
        while (b < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return b == num || num == 0;
    }
}