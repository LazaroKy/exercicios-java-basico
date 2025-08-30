package exercicio9.model;

public class Conta {
    private double saldo;
    private double chequeEspecial;
    private double usoDoChequeEspecial;

    public Conta(){}

    public Conta (double depositoInicial){
        saldo = depositoInicial;
        chequeEspecial = saldo > 500 ? saldo * 0.5 : 50.0;
        usoDoChequeEspecial = 0;
    };

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
        if(usoDoChequeEspecial !=0){
            saldo += (valor -usoDoChequeEspecial);
            usoDoChequeEspecial = 0;
        } else {
            saldo += valor;
        }
    }


    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", chequeEspecial=" + chequeEspecial +
                '}';
    }

    public void sacarValor(double valor) {
        if(saldo >= valor){
            saldo -= valor;
        } else if((saldo + chequeEspecial) >= valor){
            saldo -= valor;
            usoDoChequeEspecial = saldo *0.2;
        }else {
            throw new IllegalArgumentException("Valor de saque ultrapassa limite. Seu limite é de "+ (saldo+chequeEspecial));
        }
    }
}
