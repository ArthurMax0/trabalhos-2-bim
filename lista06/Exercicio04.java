public class Exercicio04 {
    public static void main(String[] args) {
        // 2 linhas e 3 colunas
        int[][] m = new int[2][3];
        int pares = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("m[" + i + "][" + j + "] = ").trim());
                if (m[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println("Quantidade de pares: " + pares);
    }
}
