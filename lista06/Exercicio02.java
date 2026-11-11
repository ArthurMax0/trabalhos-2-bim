public class Exercicio02 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("m[" + i + "][" + j + "] = ").trim());
                soma += m[i][j]; // ja vai somando enquanto le
            }
        }

        System.out.println("Soma: " + soma);
    }
}
