import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args){

        Integer idade = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva sua idade");
        idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("Você é de maior");
        } else if (idade <= 17){
            System.out.println("Você é de menor");
        }
    }

}
