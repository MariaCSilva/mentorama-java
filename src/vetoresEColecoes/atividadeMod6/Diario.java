package vetoresEColecoes.atividadeMod6;


import java.util.*;

public class Diario {
   private Map<String, Aluno> alunos;
   private Map<String,List<String>> presencas;

   private Map<Date, Map<String,List<String>>> diario;

    public Diario() {
        this.alunos = new HashMap<>();
        this.presencas = new HashMap<>();
        this.diario = new HashMap<>();
    }

    public Map<String, Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno (Aluno aluno) {
        this.alunos.put(aluno.getCodigo(), aluno);
    }

    public Map<Date, Map<String,List<String>>> getDiario() {
        return diario;
    }

    public void adicionarPresenca(Date data, String presenca, Aluno aluno ) {
        if(this.presencas.get(aluno.getCodigo()) == null){
            this.presencas.put(aluno.getCodigo(),new ArrayList<>());
            this.presencas.get(aluno.getCodigo()).add(presenca);
        }else {
            this.presencas.get(aluno.getCodigo()).add(presenca);
        }
        this.diario.put(data, presencas);
    }

    public void imprime(){
        List<Date> dates = new ArrayList<>(diario.keySet());
          for (Date data: diario.keySet()){
            if(dates.indexOf(data) == 0){
                System.out.printf("%55s",DataUtil.dataFormatada(data));
            }else {
                System.out.printf("%20s",DataUtil.dataFormatada(data));
            }
        }
        System.out.println();
        for (Aluno aluno: getAlunos().values()){
            System.out.printf("%40s",aluno.getNome());
            if(presencas.get(aluno.getCodigo()) != null){
                for (String p :presencas.get(aluno.getCodigo())){
                    System.out.printf("%15s",p);
                }
            }

            System.out.println();
        }


    }
}
