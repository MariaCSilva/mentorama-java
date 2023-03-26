package vetoresEColecoes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Colecoes {
    public static void main(String[] args) {
        arrayList();
        linkedList();
    }

    public static void arrayList(){
        System.out.println("Arraylist usando a Interface List");
        List<String> list = new ArrayList<>();
        manipularLista(list);
    }

    public static void linkedList(){
        System.out.println("LinkedList usando a Interface List");
        List<String> list = new LinkedList<>();
        manipularLista(list);
    }

    public static void manipularLista(List<String> colecao){
        colecao.add("Carro");
        colecao.add("Moto");
        colecao.add("Barco");
        colecao.add("Carro");

        System.out.println(colecao.get(0));
        System.out.println(colecao.get(2));
        System.out.println("------------------------");
        for (String veiculo: colecao){
            System.out.println(veiculo);
        }
        System.out.println("------------------------");
        colecao.remove(0);
        for (int i = 0; i < colecao.size();i++){
            System.out.println(colecao.get(i));
        }
    }
}
