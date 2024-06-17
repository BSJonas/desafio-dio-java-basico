package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String[] candidatos = {"Felipe","Marcia","Júlia","Paulo","Augusto"};
		for (String candidato: candidatos){
			entrandoEmContato(candidato);
			System.out.println("O candidato selecionado foi " + candidato);
		}
//		selecaoCandidatos();
//		imprimirSelecionados();


	}

	static void entrandoEmContato(String candidato){
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do{
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando){
				tentativasRealizadas++;
			}else {
				System.out.println("Contato realizado com sucesso!");
			}
		}while (continuarTentando && tentativasRealizadas<3);
		if (atendeu){
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
		}else{
			System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + tentativasRealizadas + " realizada");
		}
	}
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}

	static void imprimirSelecionados(){
		String[] candidatos = {"Felipe","Marcia","Júlia","Paulo","Augusto"};
		System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
		for (String candidato: candidatos){
			System.out.println("O candidato selecionado foi " + candidato);
		}

	}

	static void selecaoCandidatos(){
		String[] candidatos = {"Felipe","Marcia","Júlia","Paulo","Augusto","Monica","Fabrício","Mirela","Daniela","Jorge"};

		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase=2000.0;
		while (candidatosSelecionados < 5  && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();

			System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
			if (salarioBase >= salarioPretendido){
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}

	static void analisarCandidato(double salarioPretendido){
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para candidato");
		}else if (salarioBase == salarioPretendido) {
			System.out.println("Ligar para candidato com contra proposta");
		}else{
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}
}
