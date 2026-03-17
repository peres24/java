import java.util.Scanner;
public class Exer13{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int mes;
        System.out.printf("Informe o mês do ano(1-12):");
        mes = ler.nextInt();
        switch (mes) {
            case 1:
                System.out.printf("JANEIRO: VERÃO\n");
                break;
            case 2:
                System.out.printf("FEVEREIRO: VERÃO\n");
                break;
            case 3:
                System.out.printf("MARÇO: VERÃO/OUTONO\n");
                break;
            case 4:
                System.out.printf("ABRIL: OUTONO\n");
                break;
            case 5:
                System.out.printf("MAIO: OUTONO\n");
                break;
            case 6:
                System.out.printf("JUNHO: OUTONO/INVERNO\n");
                break;
            case 7:
                System.out.printf("JULHO: INVERNO\n");
                break;
            case 8:
                System.out.printf("AGOSTO: INVERNO\n");
                break;
            case 9:
                System.out.printf("SETEMBRO: INVERNO/PRIMAVERA\n");
                break;
            case 10:
                System.out.printf("OUTUBRO: PRIMAVERA\n");
                break;
            case 11:
                System.out.printf("NOVEMBRO: PRIMAVERA\n");
                break;
            case 12:
                System.out.printf("DEZEMBRO: PRIMAVERA/VERÃO\n");
                break;
            default:
                System.out.printf("Mês invalido (1-12)");
                break;
        }
    }
}