import java.util.Scanner;

public class ExemploDeIdade {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = s.nextInt();

        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);
    }

    public static String getIdade(int idade) {
        if (idade >= 6 && idade <= 10) {
            return "Você é uma criança";
        } else if (idade >= 11 && idade <= 18) {
            return "Você é um adolescente";
        } else {
            return "Você é um adulto";
        }
    }
}
