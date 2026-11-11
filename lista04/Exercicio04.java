public class Exercicio04 {
    public static void main(String[] args) {
        double[] precos = new double[5];
        double total = 0;

        for (int i = 0; i < precos.length; i++) {
            precos[i] = Double.parseDouble(IO.readln("Preço do produto " + (i + 1) + ": ").replace(',', '.'));
            total += precos[i];
        }

        System.out.println();
        System.out.println("Preços que você digitou:");
        for (int i = 0; i < precos.length; i++) {
            System.out.printf("Produto %d: R$ %.2f%n", i + 1, precos[i]);
        }

        System.out.printf("Total da compra: R$ %.2f%n", total);
    }
}
