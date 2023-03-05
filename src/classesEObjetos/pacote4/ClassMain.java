package classesEObjetos.pacote4;

import static classesEObjetos.pacote4.Carro.*;

public class ClassMain {

    public static void main(String[] args){
      Carro carro1 = new Carro(4,"Utilitário","Honda","1LA a1A17S EP s06878","2010",GASOLINA);
      carro1.setArCondicionado(true);
      carro1.setQuilometragem(500L);
      carro1.exibeInformacoes();

        Carro carro2 = new Carro(4,"Hatch","Chevrolet","7ee cumZ0A sp n13052","2022",FLEX);
        carro2.setCor(ROSA);
        carro2.setFlex(true);
        carro2.exibeInformacoes();
    }

}
