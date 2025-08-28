package exercicio9.model;

public class conta {
    private double saldo;
    private double chequeEspecial;

    public conta(double saldo) {
        this.saldo = saldo;
        if(saldo >500) this.chequeEspecial = saldo * 0.5;
        else this.chequeEspecial = 50.0;

    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }
}
