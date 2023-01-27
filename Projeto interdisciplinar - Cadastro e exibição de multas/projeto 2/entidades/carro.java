package entidades;

public class carro extends veiculo {

    private int portas;
    private String airBag;


    public carro(String marca, String modelo, String cor, String combustivel, String placa, int anoFabricacao,
                 int portas, String airBag) {
        super(marca, modelo, cor, combustivel, placa, anoFabricacao);

        this.portas = portas;
        this.airBag = airBag;
    }


    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getAirBag() {
        return airBag;
    }

    public void setAirBag(String airBag) {
        this.airBag = airBag;
    }







}
