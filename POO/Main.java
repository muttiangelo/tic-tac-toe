package UFS.POO;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Jogador jogador1 = new Jogador('O');
        Jogador jogador2 = new Jogador('X');

        Tabuleiro classeTabuleiro = new Tabuleiro();
        char[][] tabuleiro = classeTabuleiro.iniciarTabuleiro();

        classeTabuleiro.inserirPeca(tabuleiro, 'O', 0, 0);

        for (int i = 0; i < 9; i++) {
            try {
                classeTabuleiro.inserirPeca(tabuleiro, jogador1.getSimbolo(), jogador1.getLinha(),
                        jogador1.getColuna());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Casa inválida");
            }
            if (classeTabuleiro.existeVencedor(tabuleiro)) {
                System.out.println("Vencedor: " + jogador1.getSimbolo());
                break;
            }
            classeTabuleiro.apresentarPecas(tabuleiro);

            classeTabuleiro.inserirPeca(tabuleiro, jogador2.getSimbolo(), jogador2.getLinha(), jogador2.getColuna());
            if (classeTabuleiro.existeVencedor(tabuleiro)) {
                System.out.println("Vencedor: " + jogador2.getSimbolo());
                break;
            }
            classeTabuleiro.apresentarPecas(tabuleiro);

        }

    }
}
