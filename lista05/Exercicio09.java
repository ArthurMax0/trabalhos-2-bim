public class Exercicio09 {

    public static long potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }

    public static void exibirPotencias(int[] bases, int expoente) {
        for (int b : bases) {
            System.out.println(b + "^" + expoente + " = " + potencia(b, expoente));
        }
    }

    public static void main(String[] args) {
        int expoente = Integer.parseInt(IO.readln("Expoente: ").trim());
        if (expoente < 0) {
            System.out.println("Expoente negativo não dá.");
            return;
        }

        int[] bases = new int[5];
        for (int i = 0; i < bases.length; i++) {
            bases[i] = Integer.parseInt(IO.readln("Base " + (i + 1) + ": ").trim());
        }

        System.out.println();
        exibirPotencias(bases, expoente);
    }
}
