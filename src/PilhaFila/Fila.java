package PilhaFila;

import java.util.LinkedList;

public class Fila {
    private LinkedList<Processo> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    public void adicionar(Processo processo) {
        fila.addLast(processo);
    }

    public Processo remover() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return null;
        }

        return fila.removeFirst();
    }

    public Processo verificar() {

        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return null;
        }

        return fila.getFirst();
    }

    public void mostrar() {

        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }

        System.out.println("\n--- ELEMENTOS DA FILA ---");

        for (Processo processo : fila) {
            System.out.println(processo);
        }
    }

    public void inverter() {

        LinkedList<Processo> pilha = new LinkedList<>();

        // Retira todos da fila e coloca na pilha
        while (!fila.isEmpty()) {
            pilha.push(fila.removeFirst());
        }

        // Retira da pilha e coloca novamente na fila
        while (!pilha.isEmpty()) {
            fila.addLast(pilha.pop());
        }

        System.out.println("\nFila invertida com sucesso!");
    }

    public boolean estaVazia() {
        return fila.isEmpty();
    }

    public int tamanho() {
        return fila.size();
    }
}