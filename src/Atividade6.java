import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a média final do aluno:");
        double media = sc.nextDouble();

        if (media >= 7) {
            System.out.println("Aluno Aprovado");
        } else if (media >= 5) {
            System.out.println("Aluno em Recuperação");
        } else {
            System.out.println("Aluno Reprovado");
        }

    }
}
