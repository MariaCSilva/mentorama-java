package classesEObjetos.pacote4;

public class Carro {

    public static final String VERMELHO = "Vermelho";
    public static final String ROSA = "Rosa";
    public static final String PRETO = "Preto";
    public static final String AZUL = "Azul";
    public static final String ETANOL = "Etanol";
    public static final String GASOLINA = "Gasolina";
    public static final String FLEX = "Flex";

    private Integer quantidadePortas;
    private String cor;
    private String modelo;
    private String marca;
    private Boolean arCondicionado;
    private Boolean flex;
    private String numeroChassi;
    private String anoFabricacao;

    private String combustivel;
    private Long quilometragem;

    public Carro(Integer quantidadePortas, String modelo, String marca, String numeroChassi, String anoFabricacao, String combustivel) {
        this.quantidadePortas = quantidadePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.numeroChassi = numeroChassi;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
    }

    public Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(Integer quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean hasArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(Boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public Boolean isFlex() {
        return flex;
    }

    public void setFlex(Boolean flex) {
        this.flex = flex;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public Long getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(Long quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void exibeInformacoes(){
        System.out.println("--------INFORMAÇÕES DO CARRO----------");
        System.out.println("Numero do chassi: " + getNumeroChassi());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de Fabricacao: " + getAnoFabricacao());
        System.out.println("Quantidade de portas: " + getQuantidadePortas());
        System.out.println("Combustível: " + getCombustivel());
        exibeCor();
        exibeArCondicionado();
        exibeFlex();
        exibeQuilometragem();
    }
    private void exibeCor(){
        if(getCor() != null){
            System.out.println("Cor:" + getCor());
        }
    }
    private void exibeArCondicionado(){
        if(hasArCondicionado()!= null){
            if(hasArCondicionado()){
                System.out.println("Ar condicionado: Sim" );
            }else {
                System.out.println("Ar condicionado: Não" );
            }

        }
    }
    private void exibeFlex(){
        if(isFlex()!= null){
            if(isFlex()){
                System.out.println("Flex: Sim" );
            }else {
                System.out.println("Flex: Não" );
            }

        }
    }
    private void exibeQuilometragem(){
        if (getQuilometragem() != null){
            System.out.println("Quilometragem: " + getQuilometragem());
        }
    }
}
