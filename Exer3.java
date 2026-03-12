import java.util.Scanner;
public class Exer3{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Double preco, qntd, total;
        System.out.printf("Digite o preço do produto:");
        preco = ler.nextDouble();
        System.out.printf("Digite a quantidade de produtos que você comprou:");
        qntd = ler.nextDouble();
        total = qntd * preco;
        System.out.printf("O total a pagar é:"+total);
    }
}