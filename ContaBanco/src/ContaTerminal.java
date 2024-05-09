import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int numeroConta;
		String agencia, nomeCliente;
		Double saldo;
		
		System.out.println("Por favor digite o número da Agência ! ");
		agencia = scan.nextLine();
				
		System.out.println("Por favor informe o número da conta! ");
		numeroConta = scan.nextInt();
		
		System.out.println("Informe o nome do cliente! ");
		nomeCliente = scan.next();
		
		System.out.println("Informe o saldo da conta! ");
		saldo = scan.nextDouble();
		
		System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua Agência"
				+ " é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " Já está "
						+ "disponível para saque");
	}
}