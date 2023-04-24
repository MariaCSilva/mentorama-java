package vetoresEColecoes.atividadeMod6;

import java.util.Calendar;


public class Main {

    public static void main(String[] args){
        Calendar data = Calendar.getInstance();
        data.add(Calendar.DAY_OF_MONTH, -2);
        Calendar data2 = Calendar.getInstance();
        data2.add(Calendar.DAY_OF_MONTH, -1);
        Calendar data3= Calendar.getInstance();


        Aluno aluno = new Aluno("001","Joao");
        Aluno aluno2 = new Aluno("002","Pedro");
        Aluno aluno3 = new Aluno("003","Mariana Soares Dias");
        Aluno aluno4 = new Aluno("004","Joelma");


        Diario diario = new Diario();
        diario.adicionarAluno(aluno);
        diario.adicionarAluno(aluno2);
        diario.adicionarAluno(aluno3);
        diario.adicionarAluno(aluno4);

        diario.adicionarPresenca(data.getTime(),"P",aluno);
        diario.adicionarPresenca(data.getTime(), "P",aluno2);
        diario.adicionarPresenca(data.getTime(), "F",aluno3);
        diario.adicionarPresenca(data.getTime(), "P",aluno4);

        diario.adicionarPresenca(data2.getTime(),"P",aluno);
        diario.adicionarPresenca(data2.getTime(), "P",aluno2);
        diario.adicionarPresenca(data2.getTime(), "P",aluno3);
        diario.adicionarPresenca(data2.getTime(), "P",aluno4);

        diario.adicionarPresenca(data3.getTime(),"F",aluno);
        diario.adicionarPresenca(data3.getTime(), "P",aluno2);
        diario.adicionarPresenca(data3.getTime(), "P",aluno3);
        diario.adicionarPresenca(data3.getTime(), "P",aluno4);
        diario.imprime();




    }

}
