package entidades;

public class caminhao extends veiculo{


    private int eixos;

    public caminhao(String marca, String modelo, String cor, String combustivel, String placa, int anoFabricacao, String eixos) {
        super(marca, modelo, cor, combustivel, placa, anoFabricacao);





    }




    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

}
