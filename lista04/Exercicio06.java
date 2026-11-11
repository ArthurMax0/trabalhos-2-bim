public class Exercicio06 {
    public static void main(String[] args) {
        double valor = Double.parseDouble(IO.readln("Valor do empréstimo: ").replace(',', '.'));
        double taxa = Double.parseDouble(IO.readln("Taxa de juros por mês (%): ").replace(',', '.'));

        double[] devido = new double[12];

        // indice 0 eh o mes 1, por isso o +1
        for (int i = 0; i < devido.length; i++) {
            int mes = i + 1;
            devido[i] = valor + valor * taxa / 100 * mes;
        }

        System.out.println();
        for (int i = 0; i < devido.length; i++) {
            String texto = String.format("%.2f", devido[i]).replace('.', ',');
            System.out.println("Mês " + (i + 1) + ": R$ " + texto);
        }
    }
}
