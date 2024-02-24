public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {

    }


    
    static void analisarCandidato(Double salarioPretendido) {
        double salarioBase = 2000;

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
        } 
        else {
            System.out.println("AGUARDANDO OS RESULTADOS DOS DEMAIS CANDIDATOS");
        }
    }
}
