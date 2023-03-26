package vetoresEColecoes;

import java.util.*;

public class Colecoes {
    public static void main(String[] args) {
        arrayList();
        linkedList();
        hashSet();
        manipularArrays();
        manipularMatrizes();
        hashMap();
        treeMap();
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

    public static void hashSet(){
        System.out.println("HashSet usando a Interface set");
        Set<String> set = new HashSet<>();
        manipularSet(set);
    }
    public static void hashMap(){
        System.out.println("HashMap usando a Interface Map");
        Map<String, String> map = new HashMap();
        manipularMap(map);
    }

    public static void treeMap(){
        System.out.println("TreeMap usando a Interface Map");
        Map<String, String> map = new TreeMap<>();
        manipularMap(map);
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

    public static void manipularSet(Set<String> colecao){
        colecao.add("Carro");
        colecao.add("Moto");
        System.out.println(colecao.add("Barco"));
        System.out.println(colecao.add("Carro"));

        for (String veiculo: colecao){
            System.out.println(veiculo);
        }
    }

    public static void manipularMap(Map<String, String> map){
        map.put("C", "Carro");
        map.put("M", "Moto");
        map.put("B", "Bicicleta");
        System.out.println(map.get("C"));

    }

    public static void manipularArrays(){
        System.out.println("Manipulando arrays");
        int[] valores = new int[4];
        valores[0] = 10;
        valores[1] = 15;
        valores[2] = 20;
        valores[3] = 25;
        for (int i = 0; i < valores.length; i++ ){
            System.out.println(valores[i]);
        }
        int[] valoresReverso = new int[valores.length];
        int posicaomaxima = valores.length - 1;
        for (int i = posicaomaxima; i >= 0; i--){
            valoresReverso[posicaomaxima - i] = valores[i];
        }

        for (int i = 0; i < valoresReverso.length; i++ ){
            System.out.println(valoresReverso[i]);
        }
    }

    public static void manipularMatrizes(){
        System.out.println("Manipulando matrizes");
        int[][] calendario = new int[5][7];

        int dia = 0;
        for (int i = 0; i< 5; i++){
            for (int x = 0; x < 7; x++){
                dia++;
                calendario[i][x] = dia;
            }
        }

        for (int i = 0; i < calendario.length; i++){
            for (int x = 0; x < calendario[i].length; x++){
                System.out.print(calendario[i][x]);
            }
            System.out.println("");
        }

    }
}
