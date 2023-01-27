package menu;


import java.util.Scanner;

import perfils.perfil;

import cadastrar.cadastroDeMultas;
public class menuMain {

    public void execMenu(){

        Scanner leia = new Scanner(System.in);

        perfil gerente = new perfil();
        perfil agente = new perfil();
        perfil motorista = new perfil();


        cadastroDeMultas cadastroDeMultas = new cadastroDeMultas();

        int opcaoPerfil=0;
        System.out.println("");
        System.out.println("Olá ! Seja bem-vindo ao Sistema de cadastro/visualização de multas. ");
        System.out.println("Selecione o perfil para começar: "+
                "\n"+"Digite o Número posicionado à frente da opção desejada: ");

        System.out.println("1°: Motorista.\n"+
                "2°: Agente.\n"+
                "3°: Gerente.");

        opcaoPerfil = leia.nextInt();

        switch (opcaoPerfil){

            case 1:
                motorista.acaoDoMotorista();
                break;

            case 2:
                agente.acaoDoAgente();
                break;

            case 3:
               gerente.acaoDoGerente();
                break;
        }

    }
}
