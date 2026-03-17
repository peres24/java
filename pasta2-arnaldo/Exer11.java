import java.util.Scanner;
public class Exer11{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int idade;
        System.out.printf("Bem vindo ao StudioCine!\nO lugar onde voce acha os melhores filmes!\n");
        System.out.printf("Digite a sua idade:");
        idade = ler.nextInt();
        System.out.printf((idade<12) ? "Menores de 12 anos: R$ 10,00\n" : (idade>=12 && idade<=60) ? "Entre 12 e 60 anos: R$ 20,00\n" : "Acima de 60 anos: R$ 10,00 (meia)\n");
    }
}