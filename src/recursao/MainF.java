package recursao;

import java.util.Scanner;

public class MainF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Digite a posição para ver o número: ");
        num = scan.nextInt();

        System.out.println("Fibonacci na posição " + num + "o numero é: " + Fibonacci.fibonacci(num));
    }
}
