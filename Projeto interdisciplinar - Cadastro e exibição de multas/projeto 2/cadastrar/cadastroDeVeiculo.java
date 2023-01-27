package cadastrar;

import entidades.caminhao;
import entidades.carro;
import entidades.moto;

import java.util.Scanner;

public class cadastroDeVeiculo {

    Scanner leia = new Scanner(System.in);

    //cadastro de caminhão;


    public caminhao cadastrarCaminhao(){


        //marca do caminhão;

        System.out.println("Digite a marca: ");
        String marcaCaminhao = leia.next();

        //modelo do caminhão;

        System.out.println("Digite o modelo: ");
        String modeloCaminhao = leia.next();

        //cor do caminhão;

        System.out.println("Digite a cor: ");
        String corCaminhao = leia.next();

        //tipo de combustivel do caminhão;

        System.out.println("Digite o tipo de combustível: ");
        String combustivelCaminhao = leia.next();

        //placa do caminhão;

        System.out.println("Digite a placa: ");
        String placaCaminhao = leia.next();

        //ano de fabricação do caminhão;

        System.out.println("Digite o ano de fabricação: ");
        int anoFabricacaoCaminhao = leia.nextInt();

        //categoria de peso do caminhão;

        System.out.println("Digite a categoria de peso: ");
        String categoriaCaminhao = leia.next();

        //numero de eixos do caminhão;

        System.out.println("Digite o número de eixos: ");
        String numeroDeEixosCaminhao = leia.next();

        return new caminhao(marcaCaminhao, modeloCaminhao, corCaminhao, combustivelCaminhao, placaCaminhao,
                anoFabricacaoCaminhao, numeroDeEixosCaminhao);

    }



    //cadastro de carro;

    public carro cadastrarCarro(){

        //marca do carro;

        System.out.println("Digite a marca: ");
        String marcaCarro = leia.next();

        //modelo do carro;

        System.out.println("Digite o modelo: ");
        String modeloCarro = leia.next();

        //cor do carro

        System.out.println("Digite a cor: ");
        String corCarro = leia.next();

        //tipo de combustivel do carro;

        System.out.println("Digite o tipo de combustível: ");
        String combustivelCarro = leia.next();

        //placa do carro;

        System.out.println("Digite a placa: ");
        String placaCarro = leia.next();

        //ano de fabricação do carro;

        System.out.println("Digite o ano de fabricação: ");
        int anoFabricacaoCarro = leia.nextInt();

        //portas do carro;

        System.out.println("Digite a quantidade de portas: ");
        int portasCarro = leia.nextInt();

        //airbag do carro;

        System.out.println("O carro possui airBag? ");
        String airBagCarro = leia.next();

        return new carro(marcaCarro, modeloCarro, corCarro, combustivelCarro, placaCarro, anoFabricacaoCarro,
                portasCarro, airBagCarro);

    }




    //cadastro de moto;

    public moto cadastrarMoto(){

        //marca da moto;

        System.out.println("Digite a marca: ");
        String marcaMoto = leia.next();

        //modelo da moto;

        System.out.println("Digite o modelo: ");
        String modeloMoto = leia.next();

        //cor da moto;

        System.out.println("Digite a cor: ");
        String corMoto = leia.next();

        //tipo de combustivel da moto;

        System.out.println("Digite o tipo de combustivel: ");
        String combustivelMoto = leia.next();

        //placa da moto;

        System.out.println("Digite a placa: ");
        String placaMoto = leia.next();

        //ano de fabricação da moto;

        System.out.println("Digite o ano de fabricação: ");
        int anoFabricacao = leia.nextInt();

        //tipo de freio;

        System.out.println("Digite o tipo de freio: ");
        String freioMoto = leia.next();

        //carenagem da moto;

        System.out.println("Digite a carenagem: ");
        String carenagemMoto = leia.next();

        return new moto(marcaMoto, modeloMoto, corMoto, combustivelMoto, placaMoto, anoFabricacao, freioMoto,
                carenagemMoto);

    }


}
