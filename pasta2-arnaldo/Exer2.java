import java.util.Scanner;
public class Exer2{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int n, n2;
        System.out.printf("Digite o 1º numero:");
        n = ler.nextInt();
        System.out.printf("Digite o 2º numero:");
        n2 = ler.nextInt();
        System.out.printf((n>n2) ? "O numero "+n+" é maior que "+n2 : "O numero "+n2+" é maior que "+n+"\n");
    }
}