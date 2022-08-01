package UFS.POO;

import java.util.Arrays;

public class Tabuleiro {

    public char[][] iniciarTabuleiro() {
        char[][] newArrchar = new char[3][3];
        for (char[] chars : newArrchar) {
            Arrays.fill(chars, ' ');
        }
        return newArrchar;
    }

    public void exibirTabuleiro(char[][] tabuleiro) {
        System.out.println();
        for (int linha = 0; linha < 2; linha++) {
            System.out.println(tabuleiro[linha][linha]);
            System.out.println();
        }
    }


    public void setJogada(char[][] arrchar, char simbolo, int linha, int coluna) {
        arrchar[linha][coluna] = simbolo;
    }


    public boolean verificarVencedor(char[][] arrchar) {
        if (arrchar[0][0] == 'X' && arrchar[0][1] == 'X' && arrchar[0][2] == 'X') {
            return true;
        } else if (arrchar[1][0] == 'X' && arrchar[1][1] == 'X' && arrchar[1][2] == 'X') {
            return true;
        } else if (arrchar[2][0] == 'X' && arrchar[2][1] == 'X' && arrchar[2][2] == 'X') {
            return true;
        } else if (arrchar[0][0] == 'X' && arrchar[1][0] == 'X' && arrchar[2][0] == 'X') {
            return true;
        } else if (arrchar[0][1] == 'X' && arrchar[1][1] == 'X' && arrchar[2][1] == 'X') {
            return true;
        } else if (arrchar[0][2] == 'X' && arrchar[1][2] == 'X' && arrchar[2][2] == 'X') {
            return true;
        } else if (arrchar[0][0] == 'X' && arrchar[1][1] == 'X' && arrchar[2][2] == 'X') {
            return true;
        } else if (arrchar[0][2] == 'X' && arrchar[1][1] == 'X' && arrchar[2][0] == 'X') {
            return true;
        } else if (arrchar[0][0] == 'O' && arrchar[0][1] == 'O' && arrchar[0][2] == 'O') {
            return true;
        } else if (arrchar[1][0] == 'O' && arrchar[1][1] == 'O' && arrchar[1][2] == 'O') {
            return true;
        } else if (arrchar[2][0] == 'O' && arrchar[2][1] == 'O' && arrchar[2][2] == 'O') {
            return true;
        } else if (arrchar[0][0] == 'O' && arrchar[1][0] == 'O' && arrchar[2][0] == 'O') {
            return true;
        } else if (arrchar[0][1] == 'O' && arrchar[1][1] == 'O' && arrchar[2][2] == 'O') {
            return true;
        } else if (arrchar[0][2] == 'O' && arrchar[1][2] == 'O' && arrchar[2][2] == 'O') {
            return true;
        } else if (arrchar[0][0] == 'O' && arrchar[1][1] == 'O' && arrchar[2][2] == 'O') {
            return true;
        } else if (arrchar[0][2] == 'O' && arrchar[1][1] == 'O' && arrchar[2][0] == 'O') {
            return true;
        } else {
            return false;
        }
    }
}



