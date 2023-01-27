package entidades;

public class multa {

    motorista motorista;
    moto moto;
    carro carro;
    caminhao caminhao;

    public multa(motorista motorista, carro carro, double valorMulta){
        this.motorista = motorista;
        this.carro = carro;
        this.valorMulta = valorMulta;
    }

    public multa(motorista motorista, caminhao caminhao, double valorMulta){
        this.motorista = motorista;
        this.caminhao = caminhao;
        this.valorMulta = valorMulta;
    }

    public multa(entidades.motorista motorista, entidades.moto moto, double valorMulta) {
        this.motorista = motorista;
        this.moto = moto;
        this.valorMulta = valorMulta;
    }




    public entidades.motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(entidades.motorista motorista) {
        this.motorista = motorista;
    }

    public entidades.moto getMoto() {
        return moto;
    }

    public void setMoto(entidades.moto moto) {
        this.moto = moto;
    }

    public entidades.carro getCarro() {
        return carro;
    }

    public void setCarro(entidades.carro carro) {
        this.carro = carro;
    }

    public entidades.caminhao getCaminhao() {
        return caminhao;
    }

    public void setCaminhao(entidades.caminhao caminhao) {
        this.caminhao = caminhao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public double valorMulta;


}
