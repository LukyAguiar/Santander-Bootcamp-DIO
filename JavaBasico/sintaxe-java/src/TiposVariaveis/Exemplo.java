package TiposVariaveis;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salarioMinimo = 2500;
		
		short numeroCurto = 1;
		int numeroNormal = numeroCurto; 
		short numeroCurto2 = (short) numeroNormal; // convertendo tipo INT pra SHORT
		
		int numero = 1;
		
		numero = 2;
		
		System.out.print(numero);
		
		final double VALOR_DE_PI = 3.14; // O que é Final não pode alterar o valor;
	}

}
