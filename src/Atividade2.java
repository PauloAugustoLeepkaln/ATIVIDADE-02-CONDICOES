import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Double nota = 0.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota:");
        nota = sc.nextDouble();

        if (nota >= 8 && nota <= 10) {
            System.out.println("Nota excelente!");
        } else if (nota >= 6 && nota <= 7) {
            System.out.println("Nota boa!");
        } else if (nota >= 5) {
            System.out.println("Satisfatório!");
        } else if (nota <= 4) {
            System.out.println("Insatisfatório");
        }


    }
}
