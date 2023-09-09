package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Lucas", "Carlos", "Roberta", "Heitor", "Flávio"};

        System.out.println("Imprimindo lista de candidatos informando o indice do elemento");

        for (int indice = 0;indice < candidatos.length; indice++){
            System.out.println("O candidato de nº"+(indice+1)+" é "+candidatos[indice]);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Lucas", "Carlos", "Roberta", "Heitor", "Flávio", "Joana", "Olga"};

        int selecionados = 0;
        int atual = 0;
        double salarioBase = 2000;

        while(selecionados < 5 && atual < candidatos.length){
            String candidato = candidatos[atual];
            double salarioIdeal = valorIdeal();

            System.out.println("O candidato "+candidato+", solicitou "+salarioIdeal+" reais de salário.");

            if(salarioBase >= salarioIdeal){
                System.out.println("O candidato "+candidato+", foi selecionado(a) para a vaga!");
                selecionados++;
            }
            else {
                System.out.println("O candidato "+candidato+", não foi selecionado para a vaga!");
            }
            atual++;
        }
    }

    static double valorIdeal(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioIdeal){
        double salarioBase = 2000;

        if(salarioBase > salarioIdeal){
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if(salarioBase == salarioIdeal){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO RESULTADO DOS OUTROS CANDIDATOS");
        }

    }

}