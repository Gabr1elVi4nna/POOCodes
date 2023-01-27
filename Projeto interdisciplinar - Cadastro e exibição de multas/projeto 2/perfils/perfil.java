package perfils;

import java.util.ArrayList;
import java.util.Scanner;

import cadastrar.*;
import entidades.*;
import banco.bancoDeDados;
import menu.menuMain;


public  class perfil {

    Scanner leia = new Scanner(System.in);

    cadastroDeMultas mt = new cadastroDeMultas();

    public bancoDeDados bancoDeDados = new bancoDeDados();

    public cadastroDeVeiculo cadastroDeVeiculo = new cadastroDeVeiculo();
    public cadastroDeMotorista cadastroDeMotorista = new cadastroDeMotorista();
    public cadastroDeMultas cadastroDeMultas = new cadastroDeMultas();
 //  public ArrayList<multa> multas = new ArrayList<>();
    public ArrayList<motorista> motoristas = new ArrayList<>();
    public ArrayList<carro> carros = new ArrayList<>();
    public ArrayList<caminhao> caminhoes = new ArrayList<>();
    public ArrayList<moto>motos = new ArrayList<>();


    int opcao=0;

    public void voltaInicio() {



        int opcaoPerfil=0;
        System.out.println("");
        System.out.println("Olá ! Seja bem-vindo ao Sistema de cadastro/visualização de multas. ");
        System.out.println("Selecione o perfil para começar: "+
                "\n"+"Digite o Número posicionado à frente da opção desejada: ");
        System.out.println("");
        System.out.println("1°: Motorista.\n"+
                "2°: Agente.\n"+
                "3°: Gerente.");

        opcaoPerfil = leia.nextInt();

        switch (opcaoPerfil){

            case 1:
                acaoDoMotorista();
                break;

            case 2:
                acaoDoAgente();
                break;

            case 3:
                acaoDoGerente();
                break;
        }
    }




    public void acaoDoAgente(){
        do {
            System.out.println("");
            System.out.println("Olá Agente! Seja bem-vindo " +
                    "\n"+"Digite o Número posicionado à frente da opção desejada: ");

            System.out.println("");

            System.out.println("1°: Cadastrar um Motorista novo.\n"+
                    "2°: Cadastrar um Carro novo.\n"+
                    "3°: Cadastrar um Caminhão novo.\n"+
                    "4°: Cadastrar uma Moto nova.");

            System.out.println("5°: Aplicar Multa.");
//
//            System.out.println("6°: Trocar para perfil 'Motorista'.\n"+
//                    "7°: Trocar para perfil 'Gerente'.\n"+
            System.out.println("");
            System.out.println("6°: Voltar para o Menu Principal.");

            opcao = leia.nextInt();

            switch (opcao){
                case 1:
                    motoristas.add(cadastroDeMotorista.cadastrarMotorista());
                    break;

                case 2:
                    carros.add(cadastroDeVeiculo.cadastrarCarro());
                    break;

                case 3:
                    caminhoes.add(cadastroDeVeiculo.cadastrarCaminhao());
                    break;

                case 4:
                    motos.add(cadastroDeVeiculo.cadastrarMoto());
                    break;

                case 5:

                    mt.multas.add(cadastroDeMultas.cadastrarMulta(motoristas, carros, caminhoes, motos));
                    break;


//                case 6:
//                    acaoDoMotorista();
//                    break;
//
//                case 7:
//                    acaoDoGerente();
//                    break;

                case 6:
                    voltaInicio();
                    break;
            }

        }while (opcao != 0);
    }

    public void acaoDoGerente(){
        do {
            System.out.println("");
            System.out.println("Olá Gerente! Seja bem-vindo " +
                    "\n"+"Digite o Número posicionado à frente da opção desejada: ");

            System.out.println("");

            System.out.println("1°: Cadastrar um Motorista novo.\n"+
                    "2°: Cadastrar um Carro novo.\n"+
                    "3°: Cadastrar um Caminhão novo.\n"+
                    "4°: Cadastrar uma Moto nova.");

            System.out.println("5°: Aplicar Multa.\n"+
                    "6°: Verificar Multas aplicadas em Carros.\n"+
                    "7°: Verificar Multas aplicadas em Caminhões.\n"+
                    "8°: Verificar multas aplicadas em Motos.");
            System.out.println("");
//            System.out.println("9°: Trocar para perfil 'Motorista'.\n"+
//                    "10°: Trocar para o perfil 'Agente'\n"+
//                    "00°: Sair do Sistema.");
            System.out.println("9°: °: Voltar para o Menu Principal.");

            opcao = leia.nextInt();

            switch (opcao){
                case 1:
                    motoristas.add(cadastroDeMotorista.cadastrarMotorista());
                    break;

                case 2:
                    carros.add(cadastroDeVeiculo.cadastrarCarro());
                    break;

                case 3:
                    caminhoes.add(cadastroDeVeiculo.cadastrarCaminhao());
                    break;

                case 4:
                    motos.add(cadastroDeVeiculo.cadastrarMoto());
                    break;

                case 5:
                   mt.multas.add(cadastroDeMultas.cadastrarMulta(motoristas, carros, caminhoes, motos));
                    break;

                case 6:
                    bancoDeDados.verMultasCarro(mt.multas);
                    break;

                case 7:
                    bancoDeDados.verMultasCaminhao(mt.multas);
                    break;

                case 8:
                    bancoDeDados.verMultasMoto(mt.multas);
                    break;

                case 9:
                    voltaInicio();
                    break;

//                case 10:
//                    acaoDoAgente();
//                    break;
            }

        }while (opcao != 12);
    }


    public void acaoDoMotorista(){

        do {
            System.out.println("");
            System.out.println("Olá Motorista! Seja bem-vindo " +
                    "\n"+"Digite o Número posicionado à frente da opção desejada: ");

            System.out.println("");


            System.out.println("1°: Verificar Multas aplicadas em Carros.\n"+
                    "2°: Verificar Multas aplicadas em Caminhões.\n"+
                    "3°: Verificar multas aplicadas em Motos.");
//            System.out.println("4°: Trocar para perfil 'Agente'.\n"+
//                    "5°: Trocar para perfil 'Gerente'.\n"+
//                    "0°: Sair do Sistema.");
            System.out.println("");
            System.out.println("4°: Voltar para o Menu Principal.");

            opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    bancoDeDados.verMultasCarro(mt.multas);
                    break;

                case 2:
                    bancoDeDados.verMultasCaminhao(mt.multas);
                    break;

                case 3:
                    bancoDeDados.verMultasMoto(mt.multas);
                    break;

                case 4:
                    voltaInicio();
                    break;

//                case 5:
//                    acaoDoGerente();
//                    break;
//
//            }
            }

        }while (opcao != 0);
    }



}

