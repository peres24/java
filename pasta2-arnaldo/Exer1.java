import java.util.Scanner;
public class Exer1{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.printf("Digite um numero:");
        n = ler.nextInt();
        System.out.printf((n%2==0) ? "Seu numero é par!" : "Seu numero é impar!");
    }
}