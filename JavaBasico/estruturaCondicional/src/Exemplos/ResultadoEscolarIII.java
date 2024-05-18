package Exemplos;

public class ResultadoEscolarIII {
	//Condição Ternária
	public static void main(String[] args) {
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
	}
	
	
	public class ResultadoEscolar {
		public static void main(String[] args) {
			int nota = 6;
			String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
			System.out.println(resultado);
		}
	}
	
}
