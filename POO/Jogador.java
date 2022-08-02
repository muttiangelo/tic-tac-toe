package UFS.POO;

import java.util.Scanner;

public class Jogador {

    private char simbolo;

    public Jogador(char simbolo) {
        this.simbolo = simbolo;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public int getColuna() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insira a coluna: ");
        int coluna = userInput.nextInt();
        return coluna;
    }

    public int getLinha() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insira a linha: ");
        int linha = userInput.nextInt();
        return linha;
    }

}
