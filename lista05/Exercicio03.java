public class Exercicio03 {

    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int d = 2; d * d <= numero; d++) {
            if (numero % d == 0) {
                return false;
            }
        }
        return true;
    }

    public static int contarPrimos(int[] v) {
        int qtd = 0;
        for (int n : v) {
            if (ehPrimo(n)) {
                qtd++;
            }
        }
        return qtd;
    }

    public static void exibirPrimos(int[] v) {
        System.out.print("Primos: ");
        for (int n : v) {
            if (ehPrimo(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("Número " + (i + 1) + ": ").trim());
        }

        System.out.println();
        exibirPrimos(numeros);
        System.out.println("Quantidade de primos: " + contarPrimos(numeros));
    }
}
