import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		int numero;
		String agencia;
		String nomeCliente;
		float saldo;

		Scanner leitura = new Scanner(System.in);

		System.out.println("Por favor, digite o número da conta:");
		numero = leitura.nextInt();
		leitura.nextLine();

		System.out.println("Por favor, digite o número da Agência:");
		agencia = leitura.nextLine();

		System.out.println("Por favor, digite o nome do cliente:");
		nomeCliente = leitura.nextLine();

		System.out.println("Por favor, digite o saldo do cliente:");
		saldo = leitura.nextFloat();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque");

	}
}