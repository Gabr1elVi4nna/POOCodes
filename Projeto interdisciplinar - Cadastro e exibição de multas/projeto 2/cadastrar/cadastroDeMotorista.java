package cadastrar;

import entidades.motorista;

import java.util.Scanner;

public class cadastroDeMotorista {

    public motorista cadastrarMotorista(){

        Scanner leia = new Scanner(System.in);

        //nome do motorista;

        System.out.println("Digite o nome do motorista: ");
        String nomeMotorista = leia.next();

        //cnh do motorista;

        System.out.println("Digite a CNH do motorista: ");
        String cnhMotorista = leia.next();

        return new motorista(nomeMotorista,cnhMotorista);


    }
}
