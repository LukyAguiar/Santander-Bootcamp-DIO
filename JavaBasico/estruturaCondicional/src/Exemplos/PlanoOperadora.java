package Exemplos;

public class PlanoOperadora {
	
	public static void main(String[] args) {
		
		
		String plano = "M"; //M / T
		
		//Exemplo com IF e Else e Else if
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("WhatsApp e Instagram grátis");	
			System.out.println("5Gb Youtube");	
		}
		
		//Exemcplo com Switch
		switch (plano) {
		case "T": {
			System.out.println("5Gb Youtube");
		}
		case "M": {
			System.out.println("WhatsApp e Instagram grátis");
		}
		case "B": {
			System.out.println("100 minutos de ligação");
		}
	}
		
	}
}
