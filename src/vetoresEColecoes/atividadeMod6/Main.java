package vetoresEColecoes.atividadeMod6;

import java.util.Calendar;

public class Main {

    public static void main(String[] args){
        Aluno aluno1 = new Aluno("Joao");
        Aluno aluno2 = new Aluno("Pedro");
        Calendar data = Calendar.getInstance();
        Calendar data2 = Calendar.getInstance();
        data2.add(Calendar.DAY_OF_MONTH, -1);
        Presenca presenca1 = new Presenca(true, aluno1,data2.getTime());
        Presenca presenca2 = new Presenca(false, aluno2,data2.getTime());
        Presenca presenca3 = new Presenca(true, aluno1,data.getTime());
        Presenca presenca4 = new Presenca(true, aluno2,data.getTime());
        Diario diario = new Diario(data.getTime());
        diario.addPresenca(presenca1);
        diario.addPresenca(presenca2);
        diario.addPresenca(presenca3);
        diario.addPresenca(presenca4);

        diario.imprimeDiario();
    }

}
