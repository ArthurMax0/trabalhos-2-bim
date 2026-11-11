public class Exercicio10 {

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int somar(int[] v) {
        int soma = 0;
        for (int x : v) {
            soma += x;
        }
        return soma;
    }

    public static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln("N (de 1 a 30): ").trim());

        if (n < 1 || n > 30) {
            System.out.println("Quantidade inválida.");
            return;
        }

        int[] fib = new int[n];
        for (int i = 0; i < n; i++) {
            fib[i] = fibonacci(i);
        }

        exibir(fib);
        System.out.println("Soma: " + somar(fib));
    }
}
