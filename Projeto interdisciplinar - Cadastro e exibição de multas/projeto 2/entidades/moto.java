package entidades;

public class moto extends veiculo{

    private String tipoDeFreio;
    private String carenagem;


    public moto(String marca, String modelo, String cor, String combustivel, String placa, int anoFabricacao,
                String tipoDeFreio, String carenagem) {
        super(marca, modelo, cor, combustivel, placa, anoFabricacao);

        this.tipoDeFreio = tipoDeFreio;
        this.carenagem = carenagem;

    }

    public String getTipoDeFreio() {
        return tipoDeFreio;
    }

    public void setTipoDeFreio(String tipoDeFreio) {
        this.tipoDeFreio = tipoDeFreio;
    }

    public String getCarenagem() {
        return carenagem;
    }

    public void setCarenagem(String carenagem) {
        this.carenagem = carenagem;
    }


}
