import java.util.Scanner;
public class Teatro{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        String  nome_sala, nome_espetaculo;
        int fileiras, cadeiras, opcao, i, ingresso = 100, meiaingresso = 50, sala;
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L"};
        do{
        System.out.printf("------------------------------------\n");
        System.out.printf("          TEATRO DEVISATE           \n");
        System.out.printf("------------------------------------\n");
        System.out.printf("1 - Listar Salas\n");
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
                System.out.printf("\n");
                System.out.printf("\n1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                break;
            case 2:
                System.out.printf("1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                System.out.printf("Escolha a sala: ");
                sala = ler.nextInt();
                if(sala>3 || sala<1){
                    System.out.printf("Erro: Sala Inexistente.\n");
                    break;
                }

                if(sala == 1){
                    for (i = 1; i <= 12; i++){
                    System.out.print("  "+i+" ");
                }
                    System.out.printf("\n");
                for(fileiras = 0; fileiras < 12; fileiras++){
                    for(i = 0; i < 1; i++){
                        System.out.printf(letras[fileiras]+" ");
                    }
                    for(cadeiras = 1; cadeiras < 12; cadeiras++){
                        System.out.printf("[]  ");
                    }
                    System.out.printf("[]\n");
                }
                }

                else if(sala == 2){
                    for (i = 1; i <= 12; i++){
                    System.out.print("  "+i+" ");
                }
                    System.out.printf("\n");
                for(fileiras = 0; fileiras < 12; fileiras++){
                    for(i = 0; i < 1; i++){
                        System.out.printf(letras[fileiras]+" ");
                    }
                    for(cadeiras = 1; cadeiras < 12; cadeiras++){
                        System.out.printf("[]  ");
                    }
                    System.out.printf("[]\n");
                }
                }

                else if(sala == 3){
                    for (i = 1; i <= 12; i++){
                    System.out.print("  "+i+" ");
                }
                    System.out.printf("\n");
                for(fileiras = 0; fileiras < 12; fileiras++){
                    for(i = 0; i < 1; i++){
                        System.out.printf(letras[fileiras]+" ");
                    }
                    for(cadeiras = 1; cadeiras < 12; cadeiras++){
                        System.out.printf("[]  ");
                    }
                    System.out.printf("[]\n");
                }
                }
                
                break;
        }
        }while(opcao!=7);


    }
}


// logica antiga para caso o usuario precise digitar a quantidade de cadeira ou fileira
// for (i = 1; i <= qcadeiras; i++){
//                     System.out.print("  "+i+" ");
//                 }
//                     System.out.printf("\n");
//                 for(fileiras = 0; fileiras < qfileiras; fileiras++){
//                     for(i = 0; i < 1; i++){
//                         System.out.printf(letras[fileiras]+" ");
//                     }
//                     for(cadeiras = 1; cadeiras < qcadeiras; cadeiras++){
//                         System.out.printf("[]  ");
//                     }
//                     System.out.printf("[]\n");
//                 }
//                 break;
//         }