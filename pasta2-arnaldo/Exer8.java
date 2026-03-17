import java.util.Scanner;
public class Exer8{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        Double peso, altura, imc;
        System.out.printf("Digite seu peso:");
        peso = ler.nextDouble();
        System.out.printf("Digite sua altura:");
        altura = ler.nextDouble();
        imc = peso / (altura * altura);
        System.out.printf((imc < 18.5) ? "Abaixo do peso!\n" : (imc>=18.5 && imc<25) ? "Peso normal!\n" : (imc>=25 && imc<30) ? "Sobrepeso!\n" : "Obesidade!");
    }
}