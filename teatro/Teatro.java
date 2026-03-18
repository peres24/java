import java.util.Scanner;
public class Teatro{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        String  nome_sala, nome_espetaculo;
        int fileiras, cadeiras, opcao, qfileiras = 0, qcadeiras = 0;


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
        switch(opcao){
            case 7:
                System.out.printf("Obrigado por usar nosso programa!\n");
                break;
            case 1:
                nome_sala = ler.nextLine();
                System.out.printf("Digite o nome da sala: \n");
                
                System.out.printf("Digite o nome do espetáculo: \n");
                nome_espetaculo = ler.nextLine();
                System.out.printf("\n");
                System.out.printf("Digite a quantidade de fileiras que você quer:");
                qfileiras = ler.nextInt();
                System.out.printf("Digite a quantidade de cadeiras que você quer:");
                qcadeiras = ler.nextInt();
                break;
            case 2:
                System.out.printf("1   2   3   4   5   6   7   8   9   10  11  12\n");
                for(fileiras = 0; fileiras < qfileiras; fileiras++){
                    for(cadeiras = 1; qcadeiras < 12; cadeiras++){
                        System.out.printf("[]  ");
                    }
                    System.out.printf("[]   \n");
                }
        }
        

        // System.out.printf("     1   2   3   4   5   6   7   8   9   10  11  12\n");
        // System.out.printf("A   []  []   []  []  []  []  []  []  []  []  []  []\n");
        // System.out.printf("B   []  []   []  []  []  []  []  []  []  []  []  []\n");
        // System.out.printf("C   []  []   []  []  []  []  []  []  []  []  []  []\n");
        // System.out.printf("D   []  []   []  []  []  []  []  []  []  []  []  []\n");
        // System.out.printf("E   []  []   []  []  []  []  []  []  []  []  []  []\n");
        // System.out.printf("F   []  []   []  []  []  []  []  []  []  []  []  []\n");
        // System.out.printf("G   []  []   []  []  []  []  []  []  []  []  []  []\n");
        // System.out.printf("H   []  []   []  []  []  []  []  []  []  []  []  []\n");
        // System.out.printf("I   []  []   []  []  []  []  []  []  []  []  []  []\n");
        // System.out.printf("J   []  []   []  []  []  []  []  []  []  []  []  []\n");
        // System.out.printf("K   []  []   []  []  []  []  []  []  []  []  []  []\n");
        // System.out.printf("L   []  []   []  []  []  []  []  []  []  []  []  []\n");
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