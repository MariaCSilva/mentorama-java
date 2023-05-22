package recursosDaLinguagem;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("a",true,"abc", 10);
        Cliente cliente2 = new Cliente("a",true,"iop",30);
        Cliente cliente3 = new Cliente("Angela",false,"qwe",50);

        List<Cliente> clientes = Arrays.asList(cliente1,cliente2,cliente3);
        clientes.forEach(cliente -> System.out.println(cliente.getCompras()));
        Stream<Cliente> stream = clientes.stream().filter(cliente -> cliente.getCompras()>=20 );
        List<Cliente> selecionados = stream.collect(Collectors.toList());
        selecionados.forEach(cliente -> System.out.println(cliente.getCompras()));
    }
}
