package entidades;

public class motorista {

    private String nome;



    private String cnh;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }


    public  motorista(String nome, String cnh) {
        this.nome = nome;
        this.cnh = cnh;
    }
}
