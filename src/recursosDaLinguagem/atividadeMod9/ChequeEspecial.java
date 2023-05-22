package recursosDaLinguagem.atividadeMod9;

public class ChequeEspecial {
    private double saldoChequeEspecial;
    private double limiteChequeEspecial;
    private boolean habilitado;
    private double consumoChequeEspecial;

    public double getSaldoChequeEspecial() {
        return saldoChequeEspecial;
    }

    public void setSaldoChequeEspecial(double saldoChequeEspecial) {
        this.saldoChequeEspecial = saldoChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public double getConsumoChequeEspecial() {
        return consumoChequeEspecial;
    }

    public void setConsumoChequeEspecial(double consumoChequeEspecial) {
        this.consumoChequeEspecial += consumoChequeEspecial;
    }

    @Override
    public String toString() {
        return "ChequeEspecial{" +
                "saldoChequeEspecial=" + saldoChequeEspecial +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                ", habilitado=" + habilitado +
                ", consumoChequeEspecial=" + consumoChequeEspecial +
                '}';
    }
}
