import java.util.Scanner;
public class Exer5{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Double salario, vendas, comissao;
        System.out.printf("Digite o seu salário fixo:");
        salario = ler.nextDouble();
        System.out.printf("Digite o valor em de vendas que você fez:");
        vendas = ler.nextDouble();
        comissao = salario + (vendas * 0.05);
        System.out.printf("O seu salário esse mês é de:"+comissao);
    }
}