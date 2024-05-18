package Main;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        Usuario contaUsuario = new Usuario();
        
        System.out.println("------ Cadastro Bancario $ -----");
        
        System.out.print("Digite seu nome: ");
        String nomeUsuario = scanner.next();
        contaUsuario.setNomeCliente(nomeUsuario);
        
        
        System.out.print("Digite o Numero da Conta: ");
        int numeroConta = scanner.nextInt();
        contaUsuario.setNumero(numeroConta);

        
        System.out.print("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.next();
        contaUsuario.setAgencia(numeroAgencia);
        		
        System.out.print("Digite o valor que será depositado: ");
        Double valorSaldo = scanner.nextDouble();
        contaUsuario.setSaldo(valorSaldo);
        
        System.out.println();
        
        System.out.println("Olá " + contaUsuario.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaUsuario.getAgencia() + ", conta " + contaUsuario.getNumero()  + " e seu saldo $" + contaUsuario.getSaldo() + " já está disponível para saque");

	}
	
}
