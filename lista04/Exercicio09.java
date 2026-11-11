public class Exercicio09 {
    public static void main(String[] args) {
        int[] codigos = {101, 205, 310, 420, 550};
        double[] precos = {4.50, 12.00, 7.90, 25.00, 3.20};

        int codigo = Integer.parseInt(IO.readln("Código do produto: ").trim());

        // -1 = nao achou
        int pos = -1;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Produto não encontrado.");
        } else {
            System.out.printf("Preço do produto %d: R$ %.2f%n", codigo, precos[pos]);
        }
    }
}
