import java.util.Scanner;
public class Exer6{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Double valor, desconto, total;
        System.out.printf("Digite o valor da sua compra:");
        valor = ler.nextDouble();
        desconto = (valor * 0.15);
        total = valor - desconto;
        System.out.printf("O valor descontado será de: "+desconto+"\n");
        System.out.printf("O total a ser pago com o desconto é: "+total);
    }
}