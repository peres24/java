import java.util.Scanner;
public class Exer1{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String nome;
        String cargo;
        System.out.printf("Digite seu nome:");
        nome = ler.nextLine();
        System.out.printf("Digite seu cargo:");
        cargo = ler.nextLine();
        System.out.printf("Bem-vindo ao Sistema Comercial, "+nome+". Seu acesso como "+cargo+" foi configurado com sucesso.");
    }
}