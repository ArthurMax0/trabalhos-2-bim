public class Exercicio02 {
    public static void main(String[] args) {
        double[] precos = new double[3];
        precos[0] = 12.90;
        precos[1] = 5.50;
        precos[2] = 30.00;

        for (int i = 0; i < precos.length; i++) {

            String valor = String.format("%.2f", precos[i]).replace('.', ',');
            System.out.println("Produto " + (i + 1) + ": R$ " + valor);
        }
    }
}
