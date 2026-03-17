import java.util.Scanner;
public class Exer20{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int j1, j2;
        String = resultado;
        System.out.printf("Digite o a jogada do 1 jogador:");
        j1 = ler.nextInt();
        System.out.printf("Digite o a jogada do 2 jogador:");
        j2 = ler.nextInt();


        if(j1 == j2){
            resultado = "Empate";
        }
        else if((j1 == 1 && j2 ==3) || (j1 == 3 && j2 == 2) || (j1 == 2 && j2 == 1)){
            resultado = "Jogador 1 ganhou!";
        }
        else if((j2 == 1 && j1 ==3) || (j2 == 3 && j1 == 2) || (j2 == 2 && j1 == 1)){
            resultado = "Jogador 2 ganhou!";
        }

        System.out.printf(resultado);
        
}