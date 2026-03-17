import java.util.Scanner;
public class Exer6{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int ano;
        System.out.printf("Digite o ano atual:");
        ano = ler.nextInt();
        System.out.printf((ano%4==0) ? "ANO BISSEXTO!\n" :  "ANO NÃO BISSEXTO!\n");
    }
}