package exercicio10.model;

public class Carro {
    private boolean ligado = false;
    private byte velocidade = 0;
    private byte marcha = 0;

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public byte getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(byte velocidade) {
        this.velocidade = velocidade;
    }

    public byte getMarcha() {
        return marcha;
    }

    public void setMarcha(byte marcha) {
        this.marcha = marcha;
    }
}
