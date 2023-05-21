package polimorfismo.atividadeMod8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
    private String nome;
    private Map<Integer, Conta> contaMap;
    private  Map< Integer, Cliente> clienteMap;

    public Banco(String nome) {
        this.nome = nome;
        this.contaMap = new HashMap<>();
        this.clienteMap = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContaMap() {
        List<Conta> contas = new ArrayList<>();
        for (Map.Entry<Integer,Conta> contaEntry : contaMap.entrySet()){
            contas.add(contaEntry.getValue());
        }
        return contas;
    }

    public void addConta(Conta conta) {
        this.contaMap.put(conta.getNumero(),conta);
    }
    public Conta getConta(int numero) {
        return this.contaMap.get(numero);
    }

    public List<Cliente> getClienteMap() {
        List<Cliente> clientes = new ArrayList<>();
        for (Map.Entry<Integer,Cliente> clienteEntry : clienteMap.entrySet()){
            clientes.add(clienteEntry.getValue());
        }
        return clientes;
    }

    public void addCliente(Cliente cliente) {
        this.clienteMap.put(cliente.getId(),cliente);
    }
    public Cliente getCliente(int id) {
        return this.clienteMap.get(id);
    }

    public void transferir(Conta origem, Conta destino){

    }

}
