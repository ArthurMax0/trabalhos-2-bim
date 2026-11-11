public class Exercicio03 {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {

            notas[i] = Double.parseDouble(IO.readln("Digita a nota " + (i + 1) + ": ").replace(',', '.'));
            soma = soma + notas[i];
        }

        double media = soma / notas.length;
        System.out.printf("Média: %.2f%n", media);

        if (media >= 6) {
            System.out.println("Situação: aprovado");
        } else {
            System.out.println("Situação: reprovado");
        }
    }
}
