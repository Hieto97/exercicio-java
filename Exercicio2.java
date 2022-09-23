import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {
    public static void main(String[] args) {
        //Vetor
        String[] listadeInformacoes = new String[5];
        listadeInformacoes[0] = " Detergente ";
        listadeInformacoes[1] = " chocolate" ;
        listadeInformacoes[2] = " sucrilhos" ;
        listadeInformacoes[3] = "arroz";
        listadeInformacoes[4] = "bacon";

        System.out.println(listadeInformacoes[4]);

        //Matriz

        List<String> listadeInformacoesdenumeroInteiro = new ArrayList<>();

        listadeInformacoesdenumeroInteiro.add("carteira");
        listadeInformacoesdenumeroInteiro.add("bone");
        listadeInformacoesdenumeroInteiro.add("lapis");
        listadeInformacoesdenumeroInteiro.add("mouse");
        listadeInformacoesdenumeroInteiro.add("oculos");
        listadeInformacoesdenumeroInteiro.add("lente");

        System.out.println(listadeInformacoesdenumeroInteiro.contains("lente"));
    }
}