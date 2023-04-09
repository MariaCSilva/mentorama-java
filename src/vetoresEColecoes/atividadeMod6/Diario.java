package vetoresEColecoes.atividadeMod6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Diario {
    private Date data;
    private List<Presenca> presencas;

    public Diario(Date data) {
        this.data = data;
        this.presencas = new ArrayList<>();
    }

    public List<Presenca> getPresencas() {
        return presencas;
    }

    public void addPresenca(Presenca presenca) {
        presencas.add(presenca);
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void imprimeDiario(){
        System.out.println(this.data);
        for (Presenca p : presencas){
            System.out.print(p.getAluno().getNome());
            if(p.isPresenca()){
                System.out.println(" presente");
            }else {
                System.out.println(" ausente");
            }


        }
    }

}
