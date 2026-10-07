package recursao;

public class Potencia {
    
    public static int calcular(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }

        return base * calcular(base, expoente - 1);
    }
}
