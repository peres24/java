import java.util.Scanner;
public class Exer7{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int l1, l2, l3;
        System.out.printf("Digite o 1° lado do triangulo:");
        l1 = ler.nextInt();
        System.out.printf("Digite o 2° lado do triangulo:");
        l2 = ler.nextInt();
        System.out.printf("Digite o 3° lado do triangulo:");
        l3 = ler.nextInt();
        System.out.printf((l1 == l2 && l2 == l3) ? "EQUILATERO\n" : (l1 == l2 && l2 != l3 || l2 == l3 && l3 != l1) ? "ISOSCELES\n" : "ESCALENO\n");
    }
}