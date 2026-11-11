public class Exercicio02 {

    public static double calcularImc(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String classificarImc(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        }
        return "Obesidade";
    }

    public static void exibirRelatorio(double[] pesos, double[] alturas) {
        for (int i = 0; i < pesos.length; i++) {
            double imc = calcularImc(pesos[i], alturas[i]);
            String imcTxt = String.format("%.2f", imc).replace('.', ',');
            System.out.println("Pessoa " + (i + 1) + ": IMC " + imcTxt + " - " + classificarImc(imc));
        }
    }

    public static void main(String[] args) {
        double[] pesos = new double[4];
        double[] alturas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Pessoa " + (i + 1));
            pesos[i] = Double.parseDouble(IO.readln("  Peso (kg): ").replace(',', '.'));
            alturas[i] = Double.parseDouble(IO.readln("  Altura (m): ").replace(',', '.'));
        }

        System.out.println();
        exibirRelatorio(pesos, alturas);
    }
}
