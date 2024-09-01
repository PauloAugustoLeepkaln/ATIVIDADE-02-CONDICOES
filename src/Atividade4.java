import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        final String nome = "abcd";
        final String senhacorreta = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String usuario = scanner.nextLine();

        System.out.println("Digite sua senha:");
        String senha = scanner.nextLine();

        if (nome.equals(usuario) && senhacorreta.equals(senha)) {
                System.out.println("Acesso ao Sistema");
            } else {
                System.out.println("Acesso negado");
            }
        }
    }
