package javaapplication1;

import javax.swing.JOptionPane;

public class JavaApplication1 {

    static int velha = 10;

    public static void main(String[] args) {

        // Preenchendo os vetored de 2 dimensões (velha);
        String[][] velha = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                velha[i][j] = " (   ) ";
            }
        }
        String[] simbolo = {"( X )", "( O )"};
        int atual = 0;
        while (mostraJogados(velha)) {
            int linha = new Integer(JOptionPane.showInputDialog("L")) - 1;
            int coluna = new Integer(JOptionPane.showInputDialog("C")) - 1;
            // Não aceitar valores acima de 3 ou menor que 1;
            if (linha > 2 || linha < 0) {
                JOptionPane.showMessageDialog(null, "Esse valor não é possivel de L, escolha um de 1 a 3");
                linha = new Integer(JOptionPane.showInputDialog("L")) - 1;
            }
            if (coluna > 2 || coluna < 0) {
                JOptionPane.showMessageDialog(null, "Esse valor não é possivel de C, escolha um de 1 a 3");
                coluna = new Integer(JOptionPane.showInputDialog("C")) - 1;
            }
            // Ver se já está preenchida;
            if (velha[linha][coluna] != " (   ) ") {
                JOptionPane.showMessageDialog(null, "Essa casa está ocupada, repita!");
            } else {
                velha[linha][coluna] = simbolo[atual];
                atual = 1 - atual;
            }
        }
    }

    public static boolean mostraJogados(String[][] v) {
        String texto = "";
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                texto = texto + v[i][j] + "";
            }
            texto = texto + "\n";
        }
        JOptionPane.showMessageDialog(null, texto);
        return verificaJogo(v);
    }

    public static boolean verificaJogo(String[][] v) {
        boolean verificação;
        int p = 0;
        // verificando X
        if (v[0][0].equals("( X )") && v[0][1].equals("( X )") && v[0][2].equals("( X )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador X, você ganhou!!!");
            return false;
        }
        if (v[1][0].equals("( X )") && v[1][1].equals("( X )") && v[1][2].equals("( X )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador X, você ganhou!!!");
            return false;
        }
        if (v[2][0].equals("( X )") && v[2][1].equals("( X )") && v[2][2].equals("( X )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador X, você ganhou!!!");
            return false;
        }
        if (v[0][0].equals("( X )") && v[1][0].equals("( X )") && v[2][0].equals("( X )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador X, você ganhou!!!");
            return false;
        }
        if (v[0][1].equals("( X )") && v[1][1].equals("( X )") && v[2][1].equals("( X )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador X, você ganhou!!!");
            return false;
        }
        if (v[0][2].equals("( X )") && v[1][2].equals("( X )") && v[2][2].equals("( X )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador X, você ganhou!!!");
            return false;
        }
        if (v[0][0].equals("( X )") && v[1][1].equals("( X )") && v[2][2].equals("( X )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador X, você ganhou!!!");
            return false;
        }
        if (v[0][2].equals("( X )") && v[1][1].equals("( X )") && v[2][0].equals("( X )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador X, você ganhou!!!");
            return false;
        }

        // Verificando O
        if (v[0][0].equals("( O )") && v[0][1].equals("( O )") && v[0][2].equals("( O )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador O, você ganhou!!!");
            return false;
        }
        if (v[1][0].equals("( O )") && v[1][1].equals("( O )") && v[1][2].equals("( O )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador O, você ganhou!!!");
            return false;
        }
        if (v[2][0].equals("( O )") && v[2][1].equals("( O )") && v[2][2].equals("( O )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador O, você ganhou!!!");
            return false;
        }
        if (v[0][0].equals("( O )") && v[1][0].equals("( O )") && v[2][0].equals("( O )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador O, você ganhou!!!");
            return false;
        }
        if (v[0][1].equals("( O )") && v[1][1].equals("( O )") && v[2][1].equals("( O )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador O, você ganhou!!!");
            return false;
        }
        if (v[0][2].equals("( O )") && v[1][2].equals("( O )") && v[2][2].equals("( O )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador O, você ganhou!!!");
            return false;
        }
        if (v[0][0].equals("( O )") && v[1][1].equals("( O )") && v[2][2].equals("( O )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador O, você ganhou!!!");
            return false;
        }
        if (v[0][2].equals("( O )") && v[1][1].equals("( O )") && v[2][0].equals("( O )")) {
            p = p + 1;
        }
        if (p == 1) {
            JOptionPane.showMessageDialog(null, "Parabens jogador O, você ganhou!!!");
            return false;
        }
        velha = velha - 1;
        if (velha < 1) {
            JOptionPane.showMessageDialog(null, "Jogo deu velha galerinha, não teve ganhador!!");
            return false;
        }
        return true;
    }
}
