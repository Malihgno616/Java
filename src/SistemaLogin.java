import java.util.Scanner;

public class SistemaLogin {

    public static final String USUARIO_LOGIN = "admin";
    public static final String USUARIO_SENHA = "abc123";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do usuario: ");
        String user = scan.nextLine();

        System.out.println("Digite a sua senha: ");
        String senha = scan.nextLine();

        if(user.equals(USUARIO_LOGIN) && senha.equals(USUARIO_SENHA)){
            System.out.println("Login efetuado com sucesso!!!");
        } else {
            System.out.println("Usuario ou senha incorreto");
        }
    }

}
