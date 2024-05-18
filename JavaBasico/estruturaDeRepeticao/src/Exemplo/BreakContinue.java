package Exemplo;

public class BreakContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exemplo de parar, a contagem deveria contar até 5 porém na condição colocamos o break
		for(int numero = 1; numero <=55; numero ++){
			if(numero==25) {
				System.out.println(numero);
				break;
			}
			
			System.out.println(numero);
			
		}
		
		System.out.println();
		
		// Continua
		for(int numero = 1; numero <=5; numero ++){
			if(numero==3)
				continue;
			
			System.out.println(numero);
			
		}
	}
	
	

}
