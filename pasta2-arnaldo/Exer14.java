import java.util.Scanner;
public class Exer14{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int n, n2, n3;
        System.out.printf("Digite o 1° numero:");
        n = ler.nextInt();
        System.out.printf("Digite o 2° numero:");
        n2 = ler.nextInt();
        System.out.printf("Digite o 3° numero:");
        n3 = ler.nextInt();
        System.out.printf((n>n2 && n>n3) ? "O maior numero é "+n+"\n" : (n2>n && n2>n3) ? "O maior numero é "+n2+"\n" : (n3>n && n3>n2) ? "O maior numero é "+n3+"\n" : "Os numeros sao todos iguais!");
    }
}