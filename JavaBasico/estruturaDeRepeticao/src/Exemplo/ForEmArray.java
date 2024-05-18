package Exemplo;

public class ForEmArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
		String empresas[] = {"Santander", "Itau", "Bradesco"};
		String amigos[] = {"Gabriel", "Heron", "Samuel"};

		for (int x=0; x<alunos.length; x++) {
			System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
		}
		
		System.out.println("");
		
		for(int x =0; x < empresas.length; x++) {
			System.out.println("A Empresa está " + empresas[x] + " está em " + x);
		}
		
		System.out.println("");
		
		for(int x =0; x < empresas.length; x++) {
			System.out.println("A Empresa " + empresas[x] + " está em " + x);
		}
		
		System.out.println("");
		
		
		// bloco de inicialização; expressão booleana de validação; bloco de atualização
		for(int x = 0; x < amigos.length; x++) {
			System.out.println("Gay "+ x + " " + amigos[x]);
		}
		
		
		System.out.println("");

		
		//Forma de Abreviar
		
		for(String aluno: alunos) {
			System.out.println("Nome do alunoe é " + aluno);
		}
		
		System.out.println("");
		
		for(String empresa: empresas) {
			System.out.println("Nome da empresa é " + empresa);{
			}
		}
		
		System.out.println("");
		
		for(String amigo: amigos) {
			System.out.println("Nome do amigo é " + amigo);
		}
	}

}
