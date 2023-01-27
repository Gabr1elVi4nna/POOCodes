//package perfils;
//
//
//import banco.bancoDeDados;
//import entidades.*;
//
//import menu.menuMain;
//import cadastrar.*;
//import perfils.agente;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
//public class motorista{
//
//
//
//    public void acaoDoMotorista(){
//
//        Scanner leia = new Scanner(System.in);
//
//        menuMain menuMain = new menuMain();
//
//        bancoDeDados bancoDeDados = new bancoDeDados();
//
//        int opcaoMotorista=0;
//
//
//
//        System.out.println("");
//        System.out.println("Olá Motorista! Seja bem-vindo " +
//                "\n"+"Digite o Número posicionado à frente da opção desejada: ");
//
//        System.out.println("1°: Visualizar multas\n"+
//                "00°: Voltar para o Menu.");
//
//        opcaoMotorista = leia.nextInt();
//
//
//
//        switch (opcaoMotorista){
//            case 00:
//                menuMain.execMenu();
//                break;
//
//            case 1:
////                bancoDeDados.verMultasCarro(multas);
//                break;
//        }
//
//    }
//
//
//
//
//}
