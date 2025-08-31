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

    public boolean passarMarcha(){
        if(marcha <6 && isVelocidadeMaximaPermitida()){
            marcha++;
            return true;
        }
        return false;
    }
    public boolean reduzirMarcha(){
        if(marcha >0 && isVelocidadeMinimaPermitida()){
            marcha--;
            return true;
        }
        return false;
    }

    public boolean isVelocidadeMaximaPermitida(){
        return switch (marcha) {
            case 0 -> true;
            case 1 -> velocidade == 20;
            case 2 -> velocidade == 40;
            case 3 -> velocidade == 60;
            case 4 -> velocidade == 80;
            case 5 -> velocidade == 100;
            case 6 -> velocidade == 120;
            default -> false;
        };
    }
    public boolean isVelocidadeMinimaPermitida(){
        return switch (marcha) {
            case 0 -> true;
            case 1 -> velocidade == 0;
            case 2 -> velocidade >= 21;
            case 3 -> velocidade >= 41;
            case 4 -> velocidade >= 61;
            case 5 -> velocidade >= 81;
            case 6 -> velocidade >= 101;
            default -> false;
        };
    }
}
