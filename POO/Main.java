package UFS.POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);


        Jogador jogador1 = new Jogador('O');
        Jogador jogador2 = new Jogador('X');

        Tabuleiro classeTabuleiro = new Tabuleiro();
        char[][] tabuleiro = classeTabuleiro.iniciarTabuleiro();


        classeTabuleiro.setJogada(tabuleiro, 'O', 0, 0);

        for (int i = 0; i < 9; i++) {
            int jogador1LinhaChar = userInput.nextInt();
            int jogador1ColunaChar = userInput.nextInt();
            classeTabuleiro.setJogada(tabuleiro, jogador1.getSimbolo(), jogador1LinhaChar, jogador1ColunaChar);
            if (classeTabuleiro.verificarVencedor(tabuleiro)) {
                System.out.println("Vencedor: " + jogador1.getSimbolo());
                break;
            }
            classeTabuleiro.exibirTabuleiro(tabuleiro);
            System.out.println();

            int jogador2LinhaChar = userInput.nextInt();
            int jogador2ColunaChar = userInput.nextInt();
            classeTabuleiro.setJogada(tabuleiro, jogador2.getSimbolo(), jogador2LinhaChar, jogador2ColunaChar);
            if (classeTabuleiro.verificarVencedor(tabuleiro)) {
                System.out.println("Vencedor: " + jogador2.getSimbolo());
                classeTabuleiro.exibirTabuleiro(tabuleiro);
            }

        }

    }}


