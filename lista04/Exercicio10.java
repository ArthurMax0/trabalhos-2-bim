public class Exercicio10 {
    public static void main(String[] args) {
        int n = Integer.parseInt(IO.readln("Quantos itens tem na compra? ").trim());

        if (n < 1) {
            System.out.println("Quantidade inválida.");
            return;
        }

        double[] preco = new double[n];
        int[] qtd = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Item " + (i + 1));
            preco[i] = Double.parseDouble(IO.readln("  Preço unitário: ").replace(',', '.'));
            qtd[i] = Integer.parseInt(IO.readln("  Quantidade: ").trim());
        }

        System.out.println();
        double total = 0;
        for (int i = 0; i < n; i++) {
            double subtotal = preco[i] * qtd[i];
            total += subtotal;
            System.out.printf("Item %d: %d x R$ %.2f = R$ %.2f%n", i + 1, qtd[i], preco[i], subtotal);
        }

        double desconto = 0;
        if (total > 200.00) {
            desconto = total * 0.05;
        }

        System.out.printf("Total da compra: R$ %.2f%n", total);
        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Valor a pagar: R$ %.2f%n", total - desconto);
    }
}
