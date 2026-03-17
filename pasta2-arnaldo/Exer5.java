import java.util.Scanner;
public class Exer5{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Double n, n2, resul;
        int oper;
        System.out.printf("Digite o 1° numero:");
        n = ler.nextDouble();
        System.out.printf("Digite o 2° numero:");
        n2 = ler.nextDouble();
        System.out.printf("1 - Adicao\n2 - Subtracao\n3 - Divisao\n4 - Multiplicacao\nEscolha a sua operacao: ");
        oper = ler.nextInt();
        switch (oper) {
            case 1:
                resul = n+n2;
                System.out.printf("Resultado: "+resul+"\n");
                break;
            case 2:
                resul = n-n2;
                System.out.printf("Resultado: "+resul+"\n");
                break;
            case 3:
                resul = n/n2;
                System.out.printf("Resultado: "+resul+"\n");
                break;
            case 4:
                resul = n*n2;
                System.out.printf("Resultado: "+resul+"\n");
                break;
            default:
                System.out.printf("Opcao de operador invalida!");
                break;
        }
    }
}