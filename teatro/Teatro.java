import java.util.Scanner;
public class Teatro{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        String  nome_sala, nome_espetaculo;
        char linha;
        int opcao, i, c = 0, ingresso, meiaingresso, sala, coluna, livre = 144, reservada = 0, ocupada = 0, saldo = 0, saldoreserva = 0;
        String[] letras = {"    A", "  B", "  C ", " D", "  E", "  F", "  G", "  H", "  I", "  J", "  K", "  L"};
        String[] numeros = {"1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10", "11", "12"};

        String[][] bancos = new String[12][12];

        
        // Declarando na Matriz
        for(i = 0; i < 12; i++){
            for(c = 0; c < 12; c++){
                bancos[i][c] = "[ ]";
                }
            }

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
        System.out.printf("\n");
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
                System.out.printf("\n");
                if(sala>3 || sala<1){
                    System.out.println("Erro: Sala Inexistente.\n");
                    break;
                }

                if(sala == 1){
                    System.out.println("Espetaculo: A queda do gato\n");
                    for(i = 0; i < letras.length; i++){
                        System.out.printf(letras[i]);
                    }
                    System.out.printf("\n");
                    for(i = 0; i < bancos.length; i++){
                        System.out.printf(numeros[i]+" ");
            for(c = 0; c < bancos.length; c++){       
            System.out.printf(bancos[i][c]);
            }
            System.out.printf("\n");
        }
            System.out.printf("Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n");
                }

                else if(sala == 2){
                    System.out.println("Pocoyo e seus amigos encontram um novo amigo\n");
                    for(i = 0; i < letras.length; i++){
                        System.out.printf(letras[i]);
                    }
                    System.out.printf("\n");
                    for(i = 0; i < bancos.length; i++){
                        System.out.printf(numeros[i]+" ");
            for(c = 0; c < bancos.length; c++){
            System.out.printf(bancos[i][c]);
            }
            System.out.printf("\n");
        }
                }

                else if(sala == 3){
                    System.out.println("Raposo rouba a vila\n");
                    for(i = 0; i < letras.length; i++){
                        System.out.printf(letras[i]);
                    }
                    System.out.printf("\n");
                    for(i = 0; i < bancos.length; i++){
                        System.out.printf(numeros[i]+" ");
            for(c = 0; c < bancos.length; c++){
            System.out.printf(bancos[i][c]);
            }
            System.out.printf("\n");
        }
                }
                break;
            case 3:
                for(i = 0; i < letras.length; i++){
                        System.out.printf(letras[i]);
                    }
                    System.out.printf("\n");
                for(i = 0; i < bancos.length; i++){
                    System.out.printf(numeros[i]+" ");
            for(c = 0; c < bancos.length; c++){
            System.out.printf(bancos[i][c]);
            }
            System.out.printf("\n");
        }
                System.out.printf("Digite qual linha você quer(A-L): ");
                linha = ler.next().charAt(0);
                //no ASCII, os computadores interpretam o A como 65
                int linhaint = Character.toUpperCase(linha) - 64;
                if(linhaint > 12 || linhaint < 1){
                    System.out.printf("Erro: Letra invalida(A-L)\n");
                    break;
                }
                System.out.printf("Digite qual coluna quer(1-12): ");
                coluna = ler.nextInt();
                linhaint = linhaint - 1;
                coluna = coluna - 1;
                if(coluna < 1 || coluna > 12){
                    System.out.printf("Erro: Numero invalido(1-12)\n");
                    break;
                }
                if(bancos[linhaint][coluna].equals("[R]")){
                    System.out.printf("Esta cadeira ja esta reservada[R].\n");
                    break;
                }

                if(bancos[linhaint][coluna].equals("[X]")){
                    System.out.printf("Erro: Voce nao pode reservar uma cadeira ja comprada[X].\n");
                    break;
                }

                bancos[linhaint][coluna] = "[R]";
                reservada = reservada + 1;
                livre = livre - 1;
                saldoreserva = saldoreserva + 50;
                break;

            case 4:
                for(i = 0; i < letras.length; i++){
                        System.out.printf(letras[i]);
                    }
                    System.out.printf("\n");
                for(i = 0; i < bancos.length; i++){
                    System.out.printf(numeros[i]+" ");
            for(c = 0; c < bancos.length; c++){
            System.out.printf(bancos[i][c]);
            }
            System.out.printf("\n");
        }
            System.out.printf("Digite qual linha você quer(A-L): ");
                linha = ler.next().charAt(0);
                linhaint = Character.toUpperCase(linha) - 64;
                if(linhaint > 12 || linhaint < 1){
                    System.out.printf("Erro: Letra invalida(A-L)\n");
                    break;
                }
                System.out.printf("Digite qual coluna quer(1-12): ");
                coluna = ler.nextInt();
                linhaint = linhaint - 1;
                coluna = coluna - 1;
                if(coluna < 1 || coluna > 12){
                    System.out.printf("Erro: Numero invalido(1-12)\n");
                    break;
                }
                if(bancos[linhaint][coluna].equals("[R]")){
                    bancos[linhaint][coluna] = "[X]";
                    saldoreserva = saldoreserva - 50;
                    reservada = reservada - 1;
                    break;
                }
                bancos[linhaint][coluna] = "[X]";
                ocupada = ocupada + 1;
                saldo = saldo + 100;
                livre = livre - 1;
                break;

        }
        }while(opcao!=7);


    }
}