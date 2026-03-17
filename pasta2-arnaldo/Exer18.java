import java.util.Scanner;
public class Exer18{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.printf("Informe seu numero(1-10):");
        n = ler.nextInt();
        switch (n) {
            case 1:
                System.out.printf("Romano: I\n");
                break;
            case 2:
                System.out.printf("Romano: II\n");
                break;
            case 3:
                System.out.printf("Romano: III\n");
                break;
            case 4:
                System.out.printf("Romano: IV\n");
                break;
            case 5:
                System.out.printf("Romano: V\n");
                break;
            case 6:
                System.out.printf("Romano: VI\n");
                break;
            case 7:
                System.out.printf("Romano: VII\n");
                break;
            case 8:
                System.out.printf("Romano: VIII\n");
                break;
            case 9:
                System.out.printf("Romano: IX\n");
                break;
            case 10:
                System.out.printf("Romano: X\n");
                break;
            default:
                System.out.printf("Opcao invalida: (1-10)");
                break;
        }
    }
}