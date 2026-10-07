package PilhaFila.Fila;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Fila fila = new Fila();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("       BUFFER DA IMPRESSORA");
            System.out.println("1 - Adicionar processo");
            System.out.println("2 - Remover processo");
            System.out.println("3 - Verificar primeiro processo");
            System.out.println("4 - Mostrar fila");
            System.out.println("5 - Inverter fila");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            entrada.nextLine();

            if (opcao == 1) {

                System.out.print("Digite o PID: ");
                int pid = entrada.nextInt();
                entrada.nextLine();

                System.out.print("Digite o conteúdo: ");
                String conteudo = entrada.nextLine();

                Processo processo = new Processo(pid, conteudo);

                fila.adicionar(processo);

                System.out.println("Processo adicionado!");

            } else if (opcao == 2) {

                Processo processo = fila.remover();

                if (processo != null) {
                    System.out.println("Processo removido:");
                    System.out.println(processo);
                }

            } else if (opcao == 3) {

                Processo processo = fila.verificar();

                if (processo != null) {
                    System.out.println("Primeiro processo:");
                    System.out.println(processo);
                }

            } else if (opcao == 4) {

                fila.mostrar();

            } else if (opcao == 5) {

                fila.inverter();
                fila.mostrar();

            } else if (opcao == 0) {

                System.out.println("Programa encerrado.");

            } else {

                System.out.println("Opção inválida!");
            }
        }

        entrada.close();
    }
}