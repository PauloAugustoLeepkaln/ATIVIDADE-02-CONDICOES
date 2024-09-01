import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário bruto do funcionário: R$ ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Digite o número de anos que o funcionário trabalhou na empresa: ");
        int anosTrabalhados = sc.nextInt();

        double bonus = 0;
        double imposto = 0;
        double salarioLiquido;

        if (anosTrabalhados > 10) {
            bonus = 0.10 * salarioBruto;
        } else if (anosTrabalhados >= 5 && anosTrabalhados <= 10) {
            bonus = 0.05 * salarioBruto;
        }

        if (salarioBruto > 5000) {
            imposto = 0.27 * salarioBruto;
        } else if (salarioBruto >= 3000 && salarioBruto <= 4999.99) {
            imposto = 0.18 * salarioBruto;
        } else {
            imposto = 0.10 * salarioBruto;
        }

        salarioLiquido = salarioBruto + bonus - imposto;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Bônus Recebido: R$ " + bonus);
        System.out.println("Imposto Descontado: R$ " + imposto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);



    }

}
