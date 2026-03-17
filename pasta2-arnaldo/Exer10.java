import java.util.Scanner;
public class Exer10{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.printf("Digite um numero:");
        n = ler.nextInt();
        System.out.printf((n>0) ? "Numero positivo!\n" : (n<0) ? "Numero negativo!\n" : "Numero nulo(0)\n");
    }
}