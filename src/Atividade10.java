import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor total da compra: R$ ");
        double valorCompra = sc.nextDouble();

        double percentualDesconto = 0;
        double valorDesconto = 0;
        double valorFinal = 0;

        if (valorCompra > 500) {
            percentualDesconto = 20.0;
        } else if (valorCompra >= 200 && valorCompra <= 500) {
            percentualDesconto = 10.0;
        } else if (valorCompra >= 100 && valorCompra < 200) {
            percentualDesconto = 5.0;
        }

        valorDesconto = (percentualDesconto / 100) * valorCompra;
        valorFinal = valorCompra - valorDesconto;

        System.out.println("Valor original da compra: R$ " + valorCompra);
        System.out.println("Percentual de desconto aplicado: " + percentualDesconto + "%");
        System.out.println("Valor descontado: R$ " + valorDesconto);
        System.out.println("Valor final após desconto: R$ " + valorFinal);


    }
}
