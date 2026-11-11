public class Exercicio01 {

    public static String gerarLinha(char simbolo, int tamanho) {
        String linha = "";
        int cont = 0;
        while (cont < tamanho) {
            linha = linha + simbolo;
            cont++;
        }
        return linha;
    }

    public static void desenharTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            System.out.println(gerarLinha('*', i));
        }
    }

    public static void main(String[] args) {
        int[] alturas = new int[3];

        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = Integer.parseInt(IO.readln("Altura do triângulo " + (i + 1) + ": ").trim());
        }

        for (int i = 0; i < alturas.length; i++) {
            System.out.println();
            desenharTriangulo(alturas[i]);
        }
    }
}
