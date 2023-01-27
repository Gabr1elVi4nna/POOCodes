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
//public class agente {
//    Scanner leia = new Scanner(System.in);
//
//    public void acaoDoAgente(){
//
//
//
//        menuMain menuMain = new menuMain();
//
//        bancoDeDados bancoDeDados = new bancoDeDados();
//
//        cadastroDeVeiculo cadastroDeVeiculo = new cadastroDeVeiculo();
//        cadastroDeMotorista cadastroDeMotorista = new cadastroDeMotorista();
//        cadastroDeMultas cadastroDeMultas = new cadastroDeMultas();
//
//        ArrayList<motorista> motoristas = new ArrayList<>();
//        ArrayList<carro> carros = new ArrayList<>();
//        ArrayList<caminhao> caminhoes = new ArrayList<>();
//        ArrayList<moto>motos = new ArrayList<>();
//        ArrayList<multa> multas = new ArrayList<>();
//
//        int opcao = 0;
//
//        do {
//            System.out.println("");
//            System.out.println("Olá Agente! Seja bem-vindo " +
//                    "\n"+"Digite o Número posicionado à frente da opção desejada: ");
//
//            System.out.println("");
//
//            System.out.println("1°: Cadastrar um Motorista novo.\n"+
//                    "2°: Cadastrar um Carro novo.\n"+
//                    "3°: Cadastrar um Caminhão novo.\n"+
//                    "4°: Cadastrar uma Moto nova.");
//
//            System.out.println("5°: Aplicar Multa.\n"+
//                    "6°: Verificar Multas aplicadas em Carros.\n"+
//                    "7°: Verificar Multas aplicadas em Caminhões.\n"+
//                    "8°: Verificar multas aplicadas em Motos.");
//            System.out.println("9°: Voltar para o Menu.\n"+
//                    "00°: Sair do Sistema.");
//
//            opcao = leia.nextInt();
//
//            switch (opcao){
//                case 1:
//                    motoristas.add(cadastroDeMotorista.cadastrarMotorista());
//                    break;
//
//                case 2:
//                    carros.add(cadastroDeVeiculo.cadastrarCarro());
//                    break;
//
//                case 3:
//                    caminhoes.add(cadastroDeVeiculo.cadastrarCaminhao());
//                    break;
//
//                case 4:
//                    motos.add(cadastroDeVeiculo.cadastrarMoto());
//                    break;
//
//                case 5:
//                    multas.add(cadastroDeMultas.cadastrarMulta(motoristas, carros, caminhoes, motos));
//                    break;
//
//                case 6:
//                    bancoDeDados.verMultasCarro(multas);
//                    break;
//
//                case 7:
//                    bancoDeDados.verMultasCaminhao(multas);
//                    break;
//
//                case 8:
//                    bancoDeDados.verMultasMoto(multas);
//                    break;
//
//                case 9:
//                    menuMain.execMenu();
//                    break;
//            }
//
//        }while (opcao != 9);
//
//
//    }
//
//
//
//}
