public class Exercicio05 {
    public static void main(String[] args) {
        double[] originais = new double[5];
        double[] comDesconto = new double[5];

        for (int i = 0; i < originais.length; i++) {
            originais[i] = Double.parseDouble(IO.readln("Preço do produto " + (i + 1) + ": ").replace(',', '.'));
            comDesconto[i] = originais[i] * 0.90; // 10% de desconto
        }

        System.out.println();
        for (int i = 0; i < originais.length; i++) {
            System.out.printf("Produto %d: R$ %.2f -> com desconto R$ %.2f%n",
                    i + 1, originais[i], comDesconto[i]);
        }
    }
}
