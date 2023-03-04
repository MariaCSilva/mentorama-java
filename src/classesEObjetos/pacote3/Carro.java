package classesEObjetos.pacote3;

public class Carro {

    public static final String VERMELHO = "vermelho";
    public static final String PRETO = "preto";
    private final Integer quantidadePneu;

    public Carro(Integer quantidadePneu){
        this.quantidadePneu = quantidadePneu;
    }

    public void exibeCor(String cor){
        System.out.println(cor);
    }

    public void exibeQuantidade(){
        System.out.println("Quantidade de Pneus: "+ this.quantidadePneu);
    }
}
