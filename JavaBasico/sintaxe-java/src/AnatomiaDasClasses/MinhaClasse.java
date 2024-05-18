package AnatomiaDasClasses;

public class MinhaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Olá Mundo - - - ");
		
		
		//Trecho - Anatomia Classe 3 
		String primeiroNome = "Lucas";
		String segundoNome = "Aguiar";
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.print(nomeCompleto);
		
		
		
	}
	
	//Trecho Anatomia Classe 3 
	public static String nomeCompleto(String primeiroNome, String segundoNome) {
		
		String nomeCompleto = primeiroNome + " " +  segundoNome; 

		return "Resultado do método: " + nomeCompleto;
		
	}

}
