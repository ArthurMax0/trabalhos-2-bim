public class Exercicio07 {
    public static void main(String[] args) {
        double[] salarios = new double[6];
        double soma = 0;

        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = Double.parseDouble(IO.readln("Salário do funcionário " + (i + 1) + ": ").replace(',', '.'));
            soma += salarios[i];
        }

        double maior = salarios[0];
        double menor = salarios[0];
        for (int i = 1; i < salarios.length; i++) {
            if (salarios[i] > maior) {
                maior = salarios[i];
            }
            if (salarios[i] < menor) {
                menor = salarios[i];
            }
        }

        double media = soma / salarios.length;

        // tem que rodar de novo porque so da pra comparar depois de ter a media
        int acima = 0;
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > media) {
                acima++;
            }
        }

        System.out.println();
        System.out.printf("Maior salário: R$ %.2f%n", maior);
        System.out.printf("Menor salário: R$ %.2f%n", menor);
        System.out.printf("Média: R$ %.2f%n", media);
        System.out.println("Ganham acima da média: " + acima);
    }
}
