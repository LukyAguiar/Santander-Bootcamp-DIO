package debugging;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicio do programa no método main.");
		a();
		System.out.println("Final do programa no método main.");
	}
	
	static void a() {
		System.out.println("Entrou no método A.");
		b();
		System.out.println("Finalizou o método A");
	}
	
	static void b() {
		System.out.println("Entrou no método B");
		for(int i = 0; i <= 4; i++) System.out.println(i);
		c();
		System.out.println("Finalizou o método B");
	}
	
	static void c() {
		System.out.println("Entrou no método C");
		Thread.dumpStack(); //força quebrar
		System.out.println("Finalizou o méotdo C");
	}

}
