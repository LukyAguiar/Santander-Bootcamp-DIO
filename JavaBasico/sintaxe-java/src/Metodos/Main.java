package Metodos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv smartTv = new Tv();
		
		System.out.println("TV Ligada? " + smartTv.ligada);
		System.out.println("Canal Atual? " + smartTv.canal);
		System.out.println("Volume Atual? " + smartTv.volume);
		
		System.out.println();
		System.out.println("Aplicando um método - ");
		System.out.println();
		
		smartTv.ligarTv();
		smartTv.abaixarVolume();
		smartTv.abaixarVolume();
		smartTv.abaixarVolume();
		smartTv.aumentarVolume();
		
		System.out.println("TV Ligada? " + smartTv.ligada);
		System.out.println("Canal Atual? " + smartTv.canal);
		System.out.println("Volume Atual? " + smartTv.volume);
		
		
		
	}

}
