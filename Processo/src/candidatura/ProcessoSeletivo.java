package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args){
        
    }   
    
    static void  selecaoCandidatos(){

    String [] candidatos = {"Lucas", "Carlos", "Roberta", "Heitor", "Flávio", "Joana", "Olga"};

        int selecionados = 0;
        int atual = 0;
        double salarioBase = 2000.0;
        
        while(selecionados < 5){
            String candidato = candidatos[atual];
            double salarioIdeal = valorIdeal();
        }
    }

    static double valorIdeal(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioIdeal){
        double salarioBase = 2000.0;
        
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
