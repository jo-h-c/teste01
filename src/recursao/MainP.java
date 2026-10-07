package recursao;

import java.util.Scanner;

public class MainP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base;
        int expoente;

        System.out.println("digite a base: ");
        base = scan.nextInt();

        System.out.println("digite o expoente: ");
        expoente = scan.nextInt();

        System.out.println(base + " elevado a " + expoente + " = " + Potencia.calcular(base, expoente));
    }
}
