package PilhaFila.Pilha;

import java.util.Stack;

public class Pilha {
    private Stack<Processo> pilha;

    public Pilha() {
        pilha = new Stack<>();
    }

    public void empilhar(Processo processo) {

        pilha.push(processo);

        System.out.println("Processo empilhado com sucesso!");
    }

    public Processo desempilhar() {

        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return null;
        }

        return pilha.pop();
    }

    public Processo verificarTopo() {

        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return null;
        }

        return pilha.peek();
    }

    public void imprimirElementos() {

        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        System.out.println("\n--- ELEMENTOS DA PILHA ---");

        int i = pilha.size() - 1;

        while (i >= 0) {
            System.out.println(pilha.get(i));
            i--;
        }
    }

    public int tamanho() {
        return pilha.size();
    }
}