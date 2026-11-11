public class Exercicio05 {

    public static String paraBinario(int n) {
        if (n == 0) {
            return "0"; // senao o while nem roda
        }
        String bin = "";
        while (n > 0) {
            bin = (n % 2) + bin; // o resto vai pra esquerda
            n = n / 2;
        }
        return bin;
    }

    public static void exibirTabela(int[] v) {
        for (int n : v) {
            System.out.println(n + " = " + paraBinario(n));
        }
    }

    public static void main(String[] args) {
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            int lido = Integer.parseInt(IO.readln("Número " + (i + 1) + ": ").trim());
            while (lido < 0) {
                lido = Integer.parseInt(IO.readln("Tem que ser 0 ou mais, digita de novo: ").trim());
            }
            numeros[i] = lido;
        }

        System.out.println();
        exibirTabela(numeros);
    }
}
