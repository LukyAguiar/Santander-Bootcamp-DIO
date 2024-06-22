import dto.Cor;
import dto.Estudante;
import dto.Sexo;

public class Escola {
    public static void main(String[] args) {

        System.out.println("-----------------------");

        System.out.println("Escola do Luquinha!");

        System.out.println("-----------------------");

        Estudante estudante1 = new Estudante();
        estudante1.nome = "John";
        estudante1.idade = 12;
        estudante1.cor = Cor.CURTO;
        estudante1.sexo = Sexo.MASCULINO;

        System.out.println("nome: " + estudante1.nome);
        System.out.println("idade: " +estudante1.idade);
        System.out.println("cor do cabelo: " +estudante1.cor);
        System.out.println("sexo: " +estudante1.sexo);

        System.out.println("-----------------------");

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Sophia";
        estudante2.idade = 10;
        estudante2.cor = Cor.ESCURO;
        estudante2.sexo = Sexo.FEMININO;

        System.out.println("nome: " + estudante2.nome);
        System.out.println("idade: " +estudante2.idade);
        System.out.println("cor do cabelo: " +estudante2.cor);
        System.out.println("sexo: " +estudante2.sexo);

        System.out.println("-----------------------");

        Estudante estudante3 = new Estudante();
        estudante3.nome = "Lily";
        estudante3.idade = 11;
        estudante3.cor = Cor.ESCURO;
        estudante3.sexo = Sexo.FEMININO;

        System.out.println("nome: " + estudante3.nome);
        System.out.println("idade: " +estudante3.idade);
        System.out.println("cor do cabelo: " +estudante3.cor);
        System.out.println("sexo: " +estudante3.sexo);

        System.out.println("-----------------------");
    }
}