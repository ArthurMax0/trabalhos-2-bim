public class Exercicio06 {

    public static int contarVogais(String texto) {
        // passa pra minuscula pra nao ter que testar A e a
        String t = texto.toLowerCase();
        int qtd = 0;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                qtd++;
            }
        }
        return qtd;
    }

    public static void exibirContagem(String[] frases) {
        int maior = 0; // indice da frase com mais vogais

        for (int i = 0; i < frases.length; i++) {
            int qtd = contarVogais(frases[i]);
            System.out.println(frases[i] + " -> " + qtd + " vogais");
            if (qtd > contarVogais(frases[maior])) {
                maior = i;
            }
        }

        System.out.println("Frase com mais vogais: " + frases[maior]);
    }

    public static void main(String[] args) {
        String[] frases = new String[3];

        for (int i = 0; i < frases.length; i++) {
            frases[i] = IO.readln("Frase " + (i + 1) + ": ");
        }

        System.out.println();
        exibirContagem(frases);
    }
}
