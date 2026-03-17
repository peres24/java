import java.util.Scanner;
public class Exer17{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Double n, desc;
        System.out.printf("Digite o valor da sua compra:");
        n = ler.nextDouble();
        if (n > 500){
            desc = n - (n*0.20);
            System.out.printf("O valor final da sua compra é de: "+desc);
        }
        else if (n>=200 && n<=500){
            desc = n - (n*0.10);
            System.out.printf("O valor final da sua compra é de: "+desc);
        }
        else{
            System.out.printf("Você nao obteve desconto!\nO valor final da sua compra é de: "+n);
        }
    }
}