public class Exercicio03 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = Integer.parseInt(IO.readln("m[" + i + "][" + j + "] = ").trim());
            }
        }

        int maior = m[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (m[i][j] > maior) {
                    maior = m[i][j];
                }
            }
        }

        System.out.println("Maior valor: " + maior);
    }
}
