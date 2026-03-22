import java.util.Scanner;
public class Teatro{
    public static void main(String[]args){
        Scanner ler = new Scanner(System.in);
        char coluna;
        int opcao, g, i, c, sala, linha, livre = 144, colunaint = 0, reservada = 0, ocupada = 0, saldo = 0, saldoreserva = 0;
        int livre1 = 144, reservada1 = 0, ocupada1 = 0, saldo1 = 0, saldoreserva1 = 0;
        int livre2 = 144 ,reservada2 = 0, ocupada2 = 0, saldo2 = 0, saldoreserva2 = 0;
        String[] letras = {"    A", "  B", "  C ", " D", "  E", "  F", "  G", "  H", "  I", "  J", "  K", "  L"};
        String[] numeros = {"1 ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10", "11", "12"};

        String[][][] bancos = new String[3][12][12];

        
        // Declarando na Matriz
        for(g = 0; g < 3; g++){
            for(i = 0; i < 12; i++){
                for(c = 0; c < 12; c++){
                    bancos[g][i][c] = "[ ]";
                }
            }
        }
        

        do{
        System.out.printf("------------------------------------\n");
        System.out.printf("          TEATRO DEVISATE           \n");
        System.out.printf("------------------------------------\n");
        System.out.printf("1 - Listar Salas\n");
        System.out.printf("2 - Exibir Mapa da Sala\n");
        System.out.printf("3 - Reservar Cadeira\n");
        System.out.printf("4 - Cancelar Reserva de uma Cadeira\n");
        System.out.printf("5 - Comprar Cadeira\n");
        System.out.printf("6 - Relatório Financeiro\n");
        System.out.printf("7 - Lista de Exercícios\n");
        System.out.printf("8 - Sair\n");
        System.out.printf("Digite sua opção: ");
        opcao = ler.nextInt();
        System.out.printf("\n");
        ler.nextLine();

            switch(opcao){
            case 8:
                System.out.printf("Obrigado por usar nosso programa!\n");
                break;
            case 1:
                System.out.println("LISTA DE SALAS");
                System.out.printf("\n");
                System.out.printf("\n1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                break;
            case 2:
                System.out.println("MAPA DAS SALA");
                System.out.printf("1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                System.out.printf("Escolha a sala: ");
                sala = ler.nextInt();
                System.out.printf("\n");
                if(sala>3 || sala<1){
                    System.out.println("Erro: Sala Inexistente.\n");
                    break;
                }

                if(sala == 1){
                    sala = sala - 1;
                    System.out.println("Espetaculo: A queda do gato\n");
                    for(i = 0; i < letras.length; i++){
                System.out.printf(letras[i]);
                    }
                System.out.printf("\n");
                for(i = 0; i < 12; i++){
                    System.out.printf(numeros[i]+" ");
                    for(c = 0; c < 12; c++){       
                        System.out.printf(bancos[sala][i][c]);
                    }
                System.out.printf("\n");
                }
            System.out.printf(sala==0 ? "Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n" : sala==1 ? "Livre: "+livre1+" Reservadas: "+reservada1+" Ocupadas: "+ocupada1+"\n" : "Livre: "+livre2+" Reservadas: "+reservada2+" Ocupadas: "+ocupada2+"\n");
                }

                else if(sala == 2){
                    sala = sala - 1;
                    System.out.println("Espetaculo: Pocoyo e seus amigos vao para uma aventura\n");
                    for(i = 0; i < letras.length; i++){
                System.out.printf(letras[i]);
                    }
                System.out.printf("\n");
                for(i = 0; i < 12; i++){
                    System.out.printf(numeros[i]+" ");
                    for(c = 0; c < 12; c++){       
                        System.out.printf(bancos[sala][i][c]);
                    }
                System.out.printf("\n");
                }
            System.out.printf(sala==0 ? "Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n" : sala==1 ? "Livre: "+livre1+" Reservadas: "+reservada1+" Ocupadas: "+ocupada1+"\n" : "Livre: "+livre2+" Reservadas: "+reservada2+" Ocupadas: "+ocupada2+"\n");
                }

                else if(sala == 3){
                    sala = sala - 1;
                    System.out.println("Espetaculo: Raposo rouba a casa da formiga\n");
                    for(i = 0; i < letras.length; i++){
                System.out.printf(letras[i]);
                    }
                System.out.printf("\n");
                for(i = 0; i < 12; i++){
                    System.out.printf(numeros[i]+" ");
                    for(c = 0; c < 12; c++){       
                        System.out.printf(bancos[sala][i][c]);
                    }
                System.out.printf("\n");
                }
            System.out.printf(sala==0 ? "Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n" : sala==1 ? "Livre: "+livre1+" Reservadas: "+reservada1+" Ocupadas: "+ocupada1+"\n" : "Livre: "+livre2+" Reservadas: "+reservada2+" Ocupadas: "+ocupada2+"\n");
                }
                break;

            case 3:
                System.out.println("RESERVAR CADEIRA");
                System.out.printf("1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                System.out.printf("Escolha a sala: ");
                sala = ler.nextInt();
                sala = sala - 1;
                System.out.printf("\n");

                for(i = 0; i < letras.length; i++){
                System.out.printf(letras[i]);
                    }
                System.out.printf("\n");
                for(i = 0; i < 12; i++){
                    System.out.printf(numeros[i]+" ");
                    for(c = 0; c < 12; c++){       
                        System.out.printf(bancos[sala][i][c]);
                    }
                System.out.printf("\n");
                }
                System.out.printf(sala==0 ? "Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n" : sala==1 ? "Livre: "+livre1+" Reservadas: "+reservada1+" Ocupadas: "+ocupada1+"\n" : "Livre: "+livre2+" Reservadas: "+reservada2+" Ocupadas: "+ocupada2+"\n");

                
                System.out.printf("Digite qual coluna você quer(A-L): ");
                coluna = ler.next().charAt(0);
                //no ASCII, os computadores interpretam o A como 65
                colunaint = Character.toUpperCase(coluna) - 64;
                if(colunaint > 12 || colunaint < 0){
                    System.out.printf("Erro: Letra invalida(A-L)\n");
                    break;
                }
                System.out.printf("Digite qual linha voce quer(1-12): ");
                linha = ler.nextInt();
                colunaint = colunaint - 1;
                linha = linha - 1;
                if(linha < 0 || linha > 12){
                    System.out.printf("Erro: Numero invalido(1-12)\n");
                    break;
                }
                if(bancos[sala][linha][colunaint].equals("[R]")){
                    System.out.printf("Esta cadeira ja esta reservada[R].\n");
                    break;
                }

                if(bancos[sala][linha][colunaint].equals("[X]")){
                    System.out.printf("Erro: Voce nao pode reservar uma cadeira ja comprada[X].\n");
                    break;
                }

                bancos[sala][linha][colunaint] = "[R]";
                if(sala == 0){
                    reservada = reservada + 1;
                    livre = livre - 1;
                    saldoreserva = saldoreserva + 50;
                }
                else if(sala == 1){
                    reservada1 = reservada1 + 1;
                    livre1 = livre1 - 1;
                    saldoreserva1 = saldoreserva1 + 50;
                }
                else if(sala == 2){
                    reservada2 = reservada2 + 1;
                    livre2 = livre2 - 1;
                    saldoreserva2 = saldoreserva2 + 50;
                }
                break;
            case 4:
                System.out.println("CANCELAR RESERVA CADEIRA");
                System.out.printf("1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                System.out.printf("Escolha a sala: ");
                sala = ler.nextInt();
                sala = sala - 1;
                System.out.printf("\n");

                for(i = 0; i < letras.length; i++){
                System.out.printf(letras[i]);
                    }
                System.out.printf("\n");
                for(i = 0; i < 12; i++){
                    System.out.printf(numeros[i]+" ");
                    for(c = 0; c < 12; c++){       
                        System.out.printf(bancos[sala][i][c]);
                    }
                System.out.printf("\n");
                }
                System.out.printf(sala==0 ? "Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n" : sala==1 ? "Livre: "+livre1+" Reservadas: "+reservada1+" Ocupadas: "+ocupada1+"\n" : "Livre: "+livre2+" Reservadas: "+reservada2+" Ocupadas: "+ocupada2+"\n");

                System.out.printf("Digite qual coluna você quer(A-L): ");
                coluna = ler.next().charAt(0);
                //no ASCII, os computadores interpretam o A como 65
                colunaint = Character.toUpperCase(coluna) - 64;
                if(colunaint > 12 || colunaint < 0){
                    System.out.printf("Erro: Letra invalida(A-L)\n");
                    break;
                }
                System.out.printf("Digite qual linha voce quer(1-12): ");
                linha = ler.nextInt();
                colunaint = colunaint - 1;
                linha = linha - 1;
                if(linha < 0 || linha > 12){
                    System.out.printf("Erro: Numero invalido(1-12)\n");
                    break;
                }
                if(bancos[sala][linha][colunaint].equals("[R]")){
                    System.out.printf("Cancelamento feito com sucesso.\n");
                    bancos[sala][linha][colunaint] = "[ ]";
                    break;
                }

                if(bancos[sala][linha][colunaint].equals("[X]")){
                    System.out.printf("Erro: Voce nao cancelar a reserva de uma cadeira ja comprada[X].\n");
                    break;
                }

                System.out.printf("Erro: Cadeira vazia.\n");

                if(sala == 0){
                reservada = reservada + -1;
                livre = livre + 1;
                saldoreserva = saldoreserva - 50;
                }

                else if(sala == 1){
                reservada1 = reservada1 + -1;
                livre1 = livre1 + 1;
                saldoreserva1 = saldoreserva1 - 50;
                }

                else if(sala == 2){
                reservada2 = reservada2 + -1;
                livre2 = livre2 + 1;
                saldoreserva2 = saldoreserva2 - 50;
                }
                break;

            case 5:
                System.out.println("COMPRAR CADEIRA");
                System.out.printf("1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                System.out.printf("Escolha a sala: ");
                sala = ler.nextInt();
                sala = sala - 1;
                System.out.printf("\n");

                for(i = 0; i < letras.length; i++){
                System.out.printf(letras[i]);
                    }
                System.out.printf("\n");
                for(i = 0; i < 12; i++){
                    System.out.printf(numeros[i]+" ");
                    for(c = 0; c < 12; c++){       
                        System.out.printf(bancos[sala][i][c]);
                    }
                System.out.printf("\n");
                }
            System.out.printf(sala==0 ? "Livre: "+livre+" Reservadas: "+reservada+" Ocupadas: "+ocupada+"\n" : sala==1 ? "Livre: "+livre1+" Reservadas: "+reservada1+" Ocupadas: "+ocupada1+"\n" : "Livre: "+livre2+" Reservadas: "+reservada2+" Ocupadas: "+ocupada2+"\n");

            System.out.printf("Digite qual coluna você quer(A-L): ");
                coluna = ler.next().charAt(0);
                colunaint = Character.toUpperCase(coluna) - 64;
                if(colunaint > 12 || colunaint < 1){
                    System.out.printf("Erro: Letra invalida(A-L)\n");
                    break;
                }
                System.out.printf("Digite qual linha quer(1-12): ");
                linha = ler.nextInt();
                colunaint = colunaint - 1;
                linha = linha - 1;
                if(linha < 0 || linha > 12){
                    System.out.printf("Erro: Numero invalido(1-12)\n");
                    break;
                }
                if(bancos[sala][linha][colunaint].equals("[R]")){
                    bancos[sala][linha][colunaint] = "[X]";
                    if(sala==0){
                    saldoreserva = saldoreserva - 50;
                    reservada = reservada - 1;
                    ocupada = ocupada + 1;
                    saldo = saldo + 100;
                    }
                    else if(sala==1){
                        saldoreserva1 = saldoreserva1 - 50;
                        reservada1 = reservada1 - 1;
                        ocupada1 = ocupada1 + 1;
                        saldo1 = saldo1 + 100;
                    }
                    else if(sala==2){
                        saldoreserva2 = saldoreserva2 - 50;
                        reservada2 = reservada2 - 1;
                        ocupada2 = ocupada2 + 1;
                        saldo2 = saldo2 + 100;
                    }
                    break;
                }
                else{
                    if(sala==0){
                        ocupada = ocupada + 1;
                        saldo = saldo + 100;
                    }
                    else if(sala==1){
                        ocupada1 = ocupada1 + 1;
                        saldo1 = saldo1 + 100;
                    }
                    else if(sala==2){
                        ocupada2 = ocupada2 + 1;
                        saldo2 = saldo2 + 100;
                    }
                }
                bancos[sala][linha][colunaint] = "[X]";
                if(sala == 0){
                livre = livre - 1;
                }
                if(sala == 1){
                livre1 = livre1 - 1;
                }
                if(sala == 2){
                livre2 = livre2 - 1;
                }
                break;

            case 6:
                System.out.printf("1 - Sala do Pequeno Principe\n2 - Sala do Pocoyo\n3 - Sala da Formiga e o Raposo\n");
                System.out.printf("Escolha a sala: ");
                sala = ler.nextInt();
                sala = sala - 1;
                System.out.printf("\n");
                if(sala==0){
                System.out.println("RELATORIO FINANCEIRO");
                System.out.println("Cadeiras livres: "+livre);
                System.out.println("Cadeiras reservadas: "+reservada);
                System.out.println("Cadeiras ocupadas: "+ocupada);
                System.out.println("Total arrecadado(pagos): "+saldo);
                System.out.println("Total arrecadado(reservados): "+saldoreserva);
                System.out.println("Potencial de vendas(livres): "+livre*100);
                System.out.println("Potencial de vendas(reservados): "+saldoreserva*2);
                }
                else if(sala==1){
                System.out.println("RELATORIO FINANCEIRO");
                System.out.println("Cadeiras livres: "+livre1);
                System.out.println("Cadeiras reservadas: "+reservada1);
                System.out.println("Cadeiras ocupadas: "+ocupada1);
                System.out.println("Total arrecadado(pagos): "+saldo1);
                System.out.println("Total arrecadado(reservados): "+saldoreserva1);
                System.out.println("Potencial de vendas(livres): "+livre1*100);
                System.out.println("Potencial de vendas(reservados): "+saldoreserva1*2);
                }
                if(sala==2){
                System.out.println("RELATORIO FINANCEIRO");
                System.out.println("Cadeiras livres: "+livre2);
                System.out.println("Cadeiras reservadas: "+reservada2);
                System.out.println("Cadeiras ocupadas: "+ocupada2);
                System.out.println("Total arrecadado(pagos): "+saldo2);
                System.out.println("Total arrecadado(reservados): "+saldoreserva2);
                System.out.println("Potencial de vendas(livres): "+livre2*100);
                System.out.println("Potencial de vendas(reservados): "+saldoreserva2*2);
                }
        }
        }while(opcao!=8);
    }
}