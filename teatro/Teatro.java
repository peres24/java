import java.util.Scanner;
public class Teatro{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        String  nome_sala, nome_espetaculo;
        int fileiras, cadeiras, opcao, qfileiras = 8, qcadeiras = 10, i;
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};

        System.out.printf("------------------------------------\n");
        System.out.printf("          TEATRO DEVISATE           \n");
        System.out.printf("------------------------------------\n");
        System.out.printf("1 - Cadastrar Sala\n");
        System.out.printf("2 - Exibir Mapa da Sala\n");
        System.out.printf("3 - Reservar Cadeira\n");
        System.out.printf("4 - Comprar Cadeira\n");
        System.out.printf("5 - Relatório Financeiro\n");
        System.out.printf("6 - Lista de Exercícios\n");
        System.out.printf("7 - Sair\n");
        System.out.printf("Digite sua opção: ");

        opcao = ler.nextInt();
        ler.nextLine();

        switch(opcao){
            case 7:
                System.out.printf("Obrigado por usar nosso programa!\n");
                break;
            case 1:
                System.out.printf("Digite o nome da sala: ");
                nome_sala = ler.nextLine();
                System.out.printf("Digite o nome do espetáculo: ");
                nome_espetaculo = ler.nextLine();
                System.out.printf("\n");
                System.out.printf("Digite a quantidade de fileiras que você quer:");
                qfileiras = ler.nextInt();
                System.out.printf("Digite a quantidade de cadeiras que você quer:");
                qcadeiras = ler.nextInt();
                break;
            case 2:
                for (i = 1; i <= qcadeiras; i++){
                    System.out.print(+i+"   ");
                }
                    System.out.printf("\n");
                for(fileiras = 0; fileiras < qfileiras; fileiras++){
                    for(cadeiras = 1; cadeiras < qcadeiras; cadeiras++){
                        //for(i = 0; i < letras.length; i++){
                        //System.out.printf(letras[i]+"\n");
                    //}
                        System.out.printf("[]  ");
                    }
                    System.out.printf("[]\n");
                }
        }


        // System.out.printf("Digite o nome da sala do teatro: ");
        // nome_teatro = ler.nextLine();
        // System.out.printf("Digite o nome do espetaculo: ");
        // nome_espetaculo = ler.nextLine();
        // System.out.printf("Digite a quantidade de fileiras de cadeiras voce vai querer:");
        // fileiras = ler.nextInt();
        // if(fileiras > 12 || fileiras < 1){
        //     while(fileiras > 12 || fileiras < 1){
        //     System.out.printf("Voce pode ter no maximo 12 fileiras!\n");
        //     System.out.printf("Digite a quantidade de fileiras de cadeiras voce vai querer:");
        //     fileiras = ler.nextInt();
        //     System.out.printf("\n");
        //     }
        // }
        // System.out.printf("Digite a quantidade de cadeiras:");
        // cadeiras = ler.nextInt();
    }
}