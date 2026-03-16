import java.util.Scanner;
public class Exer3{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int media;
        System.out.printf("Digite a sua média:");
        media = ler.nextInt();
        if(media>=7){
        System.out.printf("APROVADO!");
        }
        else if(media>=5 || media<7){
            System.out.printf("RECUPERAÇÃO!");
        }
        else if(media<5){
            System.out.printf("REPROVADO!");
        }
    }
}