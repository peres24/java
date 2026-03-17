import java.util.Scanner;
public class Exer16{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.printf("Digite um numero:");
        n = ler.nextInt();
        System.out.printf((n%3==0 && n%5==0) ? "O numero é multiplo de 3 e 5!\n" : (n%3==0 && n%5==1) ? "O numero é multiplo de 3\n" : (n%3==1 && n%5==0) ? "O numero é multiplo de 5" : "O numero nao é multiplo de nenhum");
    }
}