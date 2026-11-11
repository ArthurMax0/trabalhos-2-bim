public class Exercicio04 {

    // bolha: compara vizinho com vizinho e troca se tiver fora de ordem
    // a cada volta o maior vai pro final, entao o for de dentro vai encurtando
    public static void ordenar(int[] v) {
        for (int volta = 0; volta < v.length - 1; volta++) {
            for (int j = 0; j < v.length - 1 - volta; j++) {
                if (v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public static boolean estaOrdenado(int[] v) {
        for (int i = 1; i < v.length; i++) {
            if (v[i - 1] > v[i]) {
                return false;
            }
        }
        return true;
    }

    public static void exibir(int[] v) {
        for (int n : v) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(IO.readln("Número " + (i + 1) + ": ").trim());
        }

        System.out.println();
        System.out.print("Antes: ");
        exibir(numeros);
        System.out.println("Ordenado? " + estaOrdenado(numeros));

        ordenar(numeros);

        System.out.print("Depois: ");
        exibir(numeros);
        System.out.println("Ordenado? " + estaOrdenado(numeros));
    }
}
