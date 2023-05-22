package recursosDaLinguagem.atividadeMod9.componentes;

import static polimorfismo.atividadeMod8.componentes.ConsoleColors.*;

public class Layout {
    private static final int TAMANHO = 50;
    public static void imprimeLinha(){
        System.out.println(getLinha(TAMANHO, "-"));
    }
    public static void imprimeLinha(String titulo){
        System.out.println(montaLinha(titulo.toUpperCase()));
    }
    public static void imprimeLinha(String corTexto, String titulo){
        System.out.println(corTexto+montaLinha(titulo.toUpperCase())+ RESET);
    }
    public static void exibeMensagemSucesso(String texto){
        System.out.println(GREEN+texto.toUpperCase()+RESET);
    }
    public static void exibeMensagemErro(String texto){
        System.out.println(RED+texto.toUpperCase()+RESET);
    }
    private static String montaLinha(String texto){
        texto = " "+texto+" ";
        String linha = getLinha(getTamanho(texto), "*");
        texto = linha.concat(texto);
        texto = texto.concat(linha);
        if(texto.length() % 2 == 1){
            texto = texto.concat("*");
        }
        return texto;
    }
    private static  String getLinha(int quantidade, String simbolo){
        String side = "";
        for (int i = 0; i < quantidade; i++){
            side = side.concat(simbolo);
        }
        return side;
    }
    private static  int getTamanho(String texto){
        int quant = texto.length();
        if(quant % 2 == 0){
            return  (TAMANHO - texto.length()) / 2;
        }
        return  (TAMANHO - texto.length() -1 ) / 2 ;
    }
}
