package classesEObjetos.pacote3;

public class Carro {

    public static final String VERMELHO = "vermelho";
    public static final String PRETO = "preto";
    private Integer quantidadePneu;
    private Integer quantidaDeCalotas;
    private Integer quantidaDeParafusos;


    public Carro(Integer quantidadePneu){
        setQuantidadePneu(quantidadePneu);
    }

    public Integer getQuantidadePneu() {
        return quantidadePneu + 1;
    }

    public void setQuantidadePneu(Integer quantidadePneu) {
        quantidaDeCalotas = quantidadePneu;
        quantidaDeParafusos = quantidadePneu *4;
        this.quantidadePneu = quantidadePneu;
    }

    public Integer getQuantidaDeCalotas() {
        return quantidaDeCalotas;
    }

    public void setQuantidaDeCalotas(Integer quantidaDeCalotas) {
        this.quantidaDeCalotas = quantidaDeCalotas;
    }

    public Integer getQuantidaDeParafusos() {
        return quantidaDeParafusos;
    }

    public void setQuantidaDeParafusos(Integer quantidaDeParafusos) {
        this.quantidaDeParafusos = quantidaDeParafusos;
    }

    public void exibeCor(String cor){
        System.out.println(cor);
    }

    public void imprimeValores(){
        System.out.println("Quantidade de Pneus: "+ getQuantidadePneu());
        System.out.println("Quantidade de Calotas: "+ getQuantidaDeCalotas());
        System.out.println("Quantidade de Parafusos: "+ getQuantidaDeParafusos());
    }
}
