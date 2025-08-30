package exercicio9.model;

public class Conta {
    private double saldo;
    private double chequeEspecial;
    private double usoDoChequeEspecial;
    private final double TAXA = 0.2;

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
            saldo += (valor - (usoDoChequeEspecial *TAXA));
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

    public void saqueGenericoValor(double valor) {
        if(saldo >= valor){
            saldo -= valor;
        } else if((saldo + chequeEspecial) >= valor){
            saldo -= valor;
            double ultrapassouDoSaldo =valor - saldo;
            usoDoChequeEspecial += ultrapassouDoSaldo;
        }else {
            throw new IllegalArgumentException("Valor requirido ultrapassou limite. Seu limite é de "+ (saldo+chequeEspecial));
        }
    }
}
