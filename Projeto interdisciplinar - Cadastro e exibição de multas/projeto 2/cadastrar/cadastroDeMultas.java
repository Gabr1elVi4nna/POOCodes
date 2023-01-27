package cadastrar;

import entidades.*;
import banco.bancoDeDados;

import java.util.ArrayList;
import java.util.Scanner;

public class cadastroDeMultas {

    bancoDeDados bancoDeDados = new bancoDeDados();

    public ArrayList<multa> multas = new ArrayList<>();
    Scanner leia = new Scanner(System.in);

    int opcao = 0;

    public multa cadastrarMulta(ArrayList<motorista>motoristas, ArrayList<carro>carros,
                                ArrayList<caminhao>caminhoes, ArrayList<moto>motos){

        System.out.println("Digite o Número posicionado à frente da opção desejada: ");
        System.out.println("1°: Cadastrar multa de Carro. \n" +
                "2°: Cadastrar multa de Caminhão. \n" +
                "3 - Cadastrar multa de Moto.");

        opcao = leia.nextInt();

        switch (opcao){

            case 1:
                return cadastroDeMultasDeCarro(motoristas, carros);

            case 2:
                return cadastrarMultasDeCaminhao(motoristas, caminhoes);

            case 3:
                return cadastrarMultasDeMoto(motoristas, motos);

        }

        return null;

    }


    //aplicar multa em carro
    public multa cadastroDeMultasDeCarro(ArrayList<motorista> motoristas, ArrayList<carro> carros){


        System.out.println("Digite o nome do Motorista que recebeu a multa: ");
        String nomeMotorista = leia.next();

        System.out.println("Digite a placa do Carro: ");
        String placaCarro = leia.next();

        System.out.println("Digite o valor da multa: ");
        double valorMulta = leia.nextDouble();

        motorista motorista = bancoDeDados.verMotoristas(nomeMotorista, motoristas);
        carro carro = bancoDeDados.verCarros(placaCarro, carros);



        return new multa(motorista, carro, valorMulta);

    }

    //Aplicar multa em caminhão
    public multa cadastrarMultasDeCaminhao(ArrayList<motorista> motoristas,ArrayList<caminhao> caminhoes){

        System.out.println("Digite o nome do Motorista que recebeu a multa: ");
        String nomeMotorista = leia.next();

        System.out.println("Digite a placa do Caminhão: ");
        String placaCaminhao = leia.next();

        System.out.println("Digite o valor da multa: ");
        double valorMulta = leia.nextDouble();

        motorista motorista = bancoDeDados.verMotoristas(nomeMotorista, motoristas);
        caminhao caminhao = bancoDeDados.verCaminhoes(placaCaminhao, caminhoes);


        return new multa(motorista, caminhao, valorMulta);
    }

    public multa cadastrarMultasDeMoto(ArrayList<motorista> motoristas, ArrayList<moto> motos){

        System.out.println("Digite o nome do Motorista que recebeu a multa: ");
        String nomeMotorista = leia.next();

        System.out.println("Digite a placa da Moto: ");
        String placaMoto = leia.next();

        System.out.println("Digite o valor da multa: ");
        double valorMulta = leia.nextDouble();

        motorista motorista = bancoDeDados.verMotoristas(nomeMotorista, motoristas);
        moto moto = bancoDeDados.verMotos(placaMoto, motos);



        return new multa(motorista, moto,valorMulta);
    }

}
