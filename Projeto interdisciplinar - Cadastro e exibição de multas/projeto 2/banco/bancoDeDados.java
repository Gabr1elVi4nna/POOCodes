package banco;

import entidades.*;

import java.util.ArrayList;

public class bancoDeDados{

    //motorista;

    public motorista verMotoristas(String nomeMotorista, ArrayList<motorista> motoristas){

        for (int i = 0; i <= motoristas.size(); i++){
            if(nomeMotorista.equals(motoristas.get(i).getNome())){
                System.out.println("Motorista encontrado no sistema!");
                return motoristas.get(i);
            }
        }

        System.out.println("motorista não encontrado no sistema.");
        return null;
    }


    //carro;

    public carro verCarros(String placaCarro, ArrayList<carro> carros){

        for (int i = 0; i<= carros.size(); i++){
            if (placaCarro.equals(carros.get(i).getPlaca())){
                System.out.println("Carro encontrado no sistema!");
                return carros.get(i);

            }

        }

        System.out.println("Carro não encontrado no sistema.");
        return null;
    }


    //caminhão;

    public caminhao verCaminhoes(String placaCaminhao, ArrayList<caminhao> caminhoes){

        for (int i = 0; i<= caminhoes.size(); i++){
            if (placaCaminhao.equals(caminhoes.get(i).getPlaca())){
                System.out.println("Caminhão encontrado no sistema!");
                return caminhoes.get(i);


            }


        }

        System.out.println("Caminhão não encontrado no sistema.");
        return null;

    }


    //moto;


    public moto verMotos(String placaMoto, ArrayList<moto> motos){

        for (int i=0; i<= motos.size(); i++){
            if (placaMoto.equals(motos.get(i).getPlaca())){
                System.out.println("Moto encontrada no sistema!");
                return motos.get(i);


            }


        }

        System.out.println("Moto não encontrada no sistema.");
        return null;

    }

    //multas;

    //multas de carro;

    public void verMultasCarro (ArrayList<multa> multas){

        for (int i=0; i< multas.size();i++){

            System.out.println("]=+-+-+-+-+-={ MULTA }=+-+-+-+-+-=[");
            System.out.println("Motorista: "+multas.get(i).getMotorista().getNome());
            System.out.println("Placa do Carro: "+multas.get(i).getCarro().getPlaca());
            System.out.println("");
            System.out.println("Valor da infração:         R$"+multas.get(i).valorMulta);
            System.out.println("]=+-+-+-+-+-={ MULTA }=+-+-+-+-+-=[");
        }



    }

    //multas de caminhão;

    public void verMultasCaminhao(ArrayList<multa> multas){

        for (int i=0; i< multas.size();i++){

            System.out.println(" ");
            System.out.println("]=+-+-+-+-+-={ MULTA }=+-+-+-+-+-=[");
            System.out.println("Motorista: "+multas.get(i).getMotorista().getNome());
            System.out.println("Placa do Caminhão: "+multas.get(i).getCaminhao().getPlaca());
            System.out.println("");
            System.out.println("Valor da infração:         R$"+multas.get(i).valorMulta);
            System.out.println("]=+-+-+-+-+-={ MULTA }=+-+-+-+-+-=[");
            System.out.println(" ");

        }


    }


    //multas de moto;

    public void verMultasMoto(ArrayList<multa> multas){

        for (int i=0; i< multas.size();i++){

            System.out.println("]=+-+-+-+-+-={ MULTA }=+-+-+-+-+-=[");
            System.out.println("Motorista: "+multas.get(i).getMotorista().getNome());
            System.out.println("Placa da Moto: "+multas.get(i).getMoto().getPlaca());
            System.out.println("");
            System.out.println("Valor da infração:         R$"+multas.get(i).valorMulta);
            System.out.println("]=+-+-+-+-+-={ MULTA }=+-+-+-+-+-=[");

        }


    }



}
