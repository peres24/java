import java.util.Scanner;
public class Exer8{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int dia;
        System.out.printf("Informe o dia da semana(1-7):");
        dia = ler.nextInt();
        switch (dia) {
            case 1:
                System.out.printf("DOMINGO\n");
                break;
            case 2:
                System.out.printf("SEGUNDA-FEIRA\n");
                break;
            case 3:
                System.out.printf("TERCA-FEIRA\n");
                break;
            case 4:
                System.out.printf("QUARTA-FEIRA\n");
                break;
            case 5:
                System.out.printf("QUINTA-FEIRA\n");
                break;
            case 6:
                System.out.printf("SEXTA-FEIRA\n");
                break;
            case 7:
                System.out.printf("SABADO-FEIRA\n");
                break;
            default:
                System.out.printf("Dia invalido (1-7)");
                break;
        }
    }
}