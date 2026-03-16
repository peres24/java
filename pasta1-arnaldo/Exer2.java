import java.util.Scanner;
public class Exer2{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Double preco;
        Double taxa;
        System.out.printf("Digite o preço do produto:");
        preco = ler.nextDouble();
        taxa = preco * 1.25;
        System.out.printf("O valor final do produto é:"+taxa);
    }
}