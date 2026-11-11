public class Exercicio07 {

    public static String gerarIniciais(String nomeCompleto) {

        String[] partes = nomeCompleto.trim().split(" +");
        String iniciais = "";
        for (String p : partes) {
            iniciais += p.toUpperCase().charAt(0) + ".";
        }
        return iniciais;
    }

    public static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i].trim() + " (" + gerarIniciais(nomes[i]) + ")");
        }
    }

    public static void main(String[] args) {
        String[] nomes = new String[4];

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = IO.readln("Nome do aluno " + (i + 1) + ": ");
        }

        System.out.println();
        exibirChamada(nomes);
    }
}
