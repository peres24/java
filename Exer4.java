import java.util.Scanner;
public class Exer4{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Double dolar, real, total;
        System.out.printf("Digite o preço do produto em U$:");
        dolar = ler.nextDouble();
        System.out.printf("Digite a cotação atual do real:");
        real = ler.nextDouble();
        total = dolar * real;
        System.out.printf("O valor do produto em R$ é:"+total);
    }
}