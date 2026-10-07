package PilhaFila.Fila;

import java.util.Queue;
import java.util.Stack;

public class Fila {

    private Queue<Processo> fila;

    public Fila() {
        fila = new LinkedList<>();
    }

    public void adicionar(Processo processo) {
        fila.offer(processo);
    }

    public Processo remover() {

        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return null;
        }

        return fila.poll();
    }

    public Processo verificar() {

        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return null;
        }

        return fila.peek();
    }
    
    public void mostrar() {

        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return;
        }

        System.out.println("\n--- PROCESSOS NA FILA ---");

        for (Processo processo : fila) {
            System.out.println(processo);
        }
    }

    public void inverter() {

        Stack<Processo> pilha = new Stack<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        while (!pilha.isEmpty()) {
            fila.offer(pilha.pop());
        }

        System.out.println("Fila invertida com sucesso!");
    }

    public int tamanho() {
        return fila.size();
    }
}