package Metodos;

public class Tv {
	
	public boolean ligada;
	public int canal;
	public int volume = 50;
	
	public void ligarTv() {
		this.ligada = true;
	}
	
	public void desligarTv() {
		this.ligada = false; 
	}
	
	public void canal(int valor) {

	}
	
	public void aumentarVolume() {
		if(this.volume == 100) {
			System.out.print("Volume já está no maximo");
		}else {
			volume++;
			System.out.print("Volume atual: " + this.volume);
		}
	}
	
	public void abaixarVolume() {
		if(this.volume == 0) {
			System.out.print("Volume já está 0");
		}else {
			volume--;
			System.out.print("Volume atual: " + this.volume);
		}
	}
	
	public void mudarCanal (int novoCanal) {
		this.canal = novoCanal;
		System.out.print("Canal atual: " + this.canal);
	}
	
	public void aumentarCanal() {
		canal++;
		System.out.print("Canal atual: " + this.canal);
	}
	
	public void diminuirCanal() {
		canal--;
		System.out.print("Canal atual: " + this.canal);
	}
	
}
