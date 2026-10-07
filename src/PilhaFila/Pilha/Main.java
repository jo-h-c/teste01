package PilhaFila.Pilha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Pilha pilha = new Pilha();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("         PILHA DE PROCESSOS");
            System.out.println("1 - Empilhar processo");
            System.out.println("2 - Desempilhar processo");
            System.out.println("3 - Verificar topo");
            System.out.println("4 - Imprimir elementos");
            System.out.println("5 - Ver tamanho da pilha");
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

                pilha.empilhar(processo);

            } else if (opcao == 2) {

                Processo removido = pilha.desempilhar();

                if (removido != null) {
                    System.out.println("Processo desempilhado:");
                    System.out.println(removido);
                }

            } else if (opcao == 3) {

                Processo topo = pilha.verificarTopo();

                if (topo != null) {
                    System.out.println("Processo no topo:");
                    System.out.println(topo);
                }

            } else if (opcao == 4) {

                pilha.imprimirElementos();

            } else if (opcao == 5) {

                System.out.println(
                    "Quantidade de processos: "
                    + pilha.tamanho()
                );

            } else if (opcao == 0) {

                System.out.println("Programa encerrado.");

            } else {

                System.out.println("Opção inválida!");
            }
        }

        entrada.close();
    }
}