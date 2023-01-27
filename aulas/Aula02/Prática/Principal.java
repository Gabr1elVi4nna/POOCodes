package Aula02.Prática;

public class Principal {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Caes c = new Caes();



        p.nome = "João da Silva";
        p.idade = 27;
        p.cpf = "123.456.789-00";


        c.raca = "Pitbull";
        c.nome = "Chocolate";
        c.idade = 5;
        c.pelo = "curto";
        c.sexo = "M";
        c.porte = "grande";
        c.vacinado = true;
        String vacinado;

        if (c.vacinado == true){
            vacinado = "Sim";
        }
        else{
            vacinado = "Não";
        }


        System.out.println("Nome: " + p.nome + "\nIdade: " + p.idade + "\nCPF: " + p.cpf);
        System.out.println("");
        System.out.println("Raça: "+c.raca+"\n"+"Nome: "+ c.nome+"\n"+"Idade: "+c.idade+"\n"+
                "Tamanhdo do pelo: "+c.pelo+"\n"+"Sexo: "+c.sexo+"\n"+"Porte: "+c.porte+"\n"+"Vacinado: "+vacinado);

        System.out.println("");
        System.out.println(c.nome+": " + c.latir());




    }
}
