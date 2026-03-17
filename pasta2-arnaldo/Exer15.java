import java.util.Scanner;
public class Exer15{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        String user = "usuario123", u, p;
        String password = "senha123";
        System.out.printf("Digite o usuario: ");
        u = ler.nextLine();
        System.out.printf("Digite a senha: ");
        p = ler.nextLine();
        System.out.printf((u.equals(user) && p.equals(password)) ? "Acesso permitido\n" : "Acesso negado\n");
    }
}