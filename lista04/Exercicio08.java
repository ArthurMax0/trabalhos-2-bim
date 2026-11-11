public class Exercicio08 {
    public static void main(String[] args) {
        double[] notas = new double[10];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(IO.readln("Nota do aluno " + (i + 1) + ": ").replace(',', '.'));
        }

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        // testa o >= 6 primeiro, senao quem tirou 8 cai na recuperacao
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 6) {
                aprovados++;
            } else if (notas[i] >= 4) {
                recuperacao++;
            } else {
                reprovados++;
            }
        }

        System.out.println();
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
    }
}
