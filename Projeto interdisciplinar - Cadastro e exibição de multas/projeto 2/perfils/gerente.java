//package perfils;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import entidades.motorista;
//import menu.menuMain;
//
//import banco.bancoDeDados;
//
//import cadastrar.*;
//import entidades.*;
//
//public class gerente  {
//
//    Scanner leia = new Scanner(System.in);
//
//
//    menuMain menuMain = new menuMain();
//
//    bancoDeDados bancoDeDados = new bancoDeDados();
//
//    cadastroDeVeiculo cadastroDeVeiculo = new cadastroDeVeiculo();
//    cadastroDeMotorista cadastroDeMotorista = new cadastroDeMotorista();
//    cadastroDeMultas cadastroDeMultas = new cadastroDeMultas();
//
//    ArrayList<motorista> motoristas = new ArrayList<>();
//    ArrayList<carro> carros = new ArrayList<>();
//    ArrayList<caminhao> caminhoes = new ArrayList<>();
//    ArrayList<moto>motos = new ArrayList<>();
//    ArrayList<multa> multas = new ArrayList<>();
//
//    int opcao=0;
//
//    public void acaoDoGerente(){
//
//
//        System.out.println("Olá Gerente! Seja bem-vindo " +
//                "\n"+"Digite o Número posicionado à frente da opção desejada: ");
//
//        System.out.println("1°: Cadastrar um Motorista novo.\n"+
//                "2°: Cadastrar um Carro novo.\n"+
//                "3°: Cadastrar um Caminhão novo.\n"+
//                "4°: Cadastrar uma Moto nova.");
//
//        System.out.println("5°: Aplicar Multa.\n"+
//                "6°: Verificar Multas aplicadas");
//
//        System.out.println("00°: Voltar para o Menu.");
//
//        opcao= leia.nextInt();
//
//        switch (opcao){
//
//            case 1:
//                motoristas.add(cadastroDeMotorista.cadastrarMotorista());
//            break;
//
//            case 2:
//                carros.add(cadastroDeVeiculo.cadastrarCarro());
//                break;
//
//            case 3:
//                caminhoes.add(cadastroDeVeiculo.cadastrarCaminhao());
//                break;
//
//            case 4:
//                motos.add(cadastroDeVeiculo.cadastrarMoto());
//                break;
//
//            case 5:
//                multas.add(cadastroDeMultas.cadastrarMulta(motoristas, carros, caminhoes, motos));
//                break;
//
//            case 00:
//
//
//        }
//
//
//    }
//
//
//
//}
