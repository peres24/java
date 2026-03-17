import java.util.Scanner;
public class Exer12{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        int nota;
        System.out.printf("Digite a sua nota:");
        nota = ler.nextInt();
        System.out.printf((nota<=4) ? "Nota: D\n" : (nota>=9) ? "Nota: A\n" : (nota>=7 && nota<=8) ? "Nota: B" : "Nota: C");
    }
}