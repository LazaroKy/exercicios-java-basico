package exercicio9.model;

public class Conta {
    private double saldo;
    private double chequeEspecial;
    private double usoDoChequeEspecial;


    public Conta (){};

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

    public double getUsoDoChequeEspecial() {
        return usoDoChequeEspecial;
    }

    public void setUsoDoChequeEspecial(double usoDoChequeEspecial) {
        this.usoDoChequeEspecial = usoDoChequeEspecial;
    }

    public void realizarDeposito(double valor){
        saldo += valor;
        if(saldo >500) chequeEspecial = saldo * 0.5;
        else chequeEspecial = 50.0;
    }


    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", chequeEspecial=" + chequeEspecial +
                '}';
    }

}
