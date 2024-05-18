package Exemplos;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		try {
			Number valor = Double.valueOf("a1.75");
			valor = NumberFormat.getInstance().parse("a1.75");
			System.out.println(valor);
			
		}catch(ParseException e) {
			System.out.println("O valor não foi convertido");
		}catch(NumberFormatException e){
			System.out.println("Formato do Número incorreto");
		}
	
	}
}
