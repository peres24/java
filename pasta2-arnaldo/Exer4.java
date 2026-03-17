import java.util.Scanner;
public class Exer4{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int temp;
        System.out.printf("Digite a temperatura em C°:");
        temp = ler.nextInt();
        System.out.printf((temp<15) ? "Frio\n" : (temp>=15 && temp<=25) ? "Agradavel\n" : "Quente\n");
    }
}