package recursosDaLinguagem.atividadeMod9.execucao;


import recursosDaLinguagem.Cliente;
import recursosDaLinguagem.MostraCliente;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static polimorfismo.atividadeMod8.componentes.ConsoleColors.*;

public class TestaStream {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Angela",true,"a345", 10);
        Cliente cliente2 = new Cliente("Pedro",true,"i235",30);
        Cliente cliente3 = new Cliente("Fernanda",false,"q369e",20);
        Cliente cliente4 = new Cliente("Pietro",false,"123a",35);
        Cliente cliente5= new Cliente("Joseane",true,"384",300);
        Cliente cliente6 = new Cliente("Melinda",true,"77/",300);
        Cliente cliente7 = new Cliente("Rafael",false,"*25",250);
        Cliente cliente8 = new Cliente("Joao",true,".23",5);
        Cliente cliente9 = new Cliente("Molina",true,"*-*",5);
        Cliente cliente10= new Cliente("Miranda",true,"*_*",126);

        List<Cliente> clientes = Arrays.asList(cliente1,cliente2,cliente3,cliente4,cliente5,cliente6,cliente7,cliente8,cliente9,cliente10);

       Stream<Cliente> clienteMinStream =  clientes.stream().filter(cliente -> cliente.getCompras() == clientes.stream()
               .min(Comparator.comparing(Cliente::getCompras)).get().getCompras());
        List<Cliente> selecionadosMin = clienteMinStream.collect(Collectors.toList());

        MostraCliente mostraClienteMin = new MostraCliente("O cliente obteve mínimo de compras: ", BLUE);
        selecionadosMin.forEach(mostraClienteMin);

        Stream<Cliente> clienteMaxStream =  clientes.stream().filter(cliente -> cliente.getCompras() == clientes.stream()
                .max(Comparator.comparing(Cliente::getCompras)).get().getCompras());
        List<Cliente> selecionadosMax = clienteMaxStream.collect(Collectors.toList());

        MostraCliente mostraClienteMax = new MostraCliente("O cliente obteve máximo de compras: ", GREEN);
        selecionadosMax.forEach(mostraClienteMax);


        Double media = clientes.stream()
                .mapToDouble(Cliente::getCompras)
                .average()
                .getAsDouble();
        System.out.println("A média de compras entre os é clientes: "+ media);


        }
}
