import java.util.Scanner;
public class Exer19{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Double velocidade, multa, calc;
        System.out.printf("Digite o limite da via:");
        multa = ler.nextDouble();
        System.out.printf("Digite a sua velocidade:");
        velocidade = ler.nextDouble();
        calc = (((velocidade - multa)/ multa)*100);

        if(velocidade<=multa){
            System.out.printf("Sem multa\n");
        }
        else if(calc <=20){
            System.out.printf("Multa leve\n");
        }
        else if(calc > 20 && calc <= 50){
            System.out.printf("Multa grave\n");
        }
        else if(calc > 50){
            System.out.printf("Multa grave + suspensao\n");
        }
    }
}