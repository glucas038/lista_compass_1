package ex3;

import javax.swing.*;
import java.awt.image.ImageConsumer;

public class Main {
    public static void main(String[] args) {

        Object[] perguntas = { "A Compass tem o melhor programa de estagio? ",
                               "TCP/IP é um grupo dividido em 3 camadas?",
                               "Spring Boot é um framework?",
                               "O uso de genéricos em Java traz benefícios?",
                               "Git e GitHub é a mesma coisa?",
                               "Scrum é metodologia tradicional?",
                               "Ransomware é conhecido como sequestro digital?",
                               "MongoDB é uma banco orientado a documento?",
                               "PostgreSQL é um banco orientado a grafos?",
                               "Game of Thrones é a melhor série de todos os tempos?",};

        int[] respostas = { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0};

        Object[] opcoes = { "Sim", "Não"};

        int escolha = 0;
        int acertou = 0;
        int errou = 0;
        String nome = "";

        nome = JOptionPane.showInputDialog("Insira seu nome: ");

        for (int i = 0; i < perguntas.length; i++){
            escolha = JOptionPane.showOptionDialog(null, perguntas[i], "Questionário",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION,
                    null, opcoes, opcoes[1]);

            String msg = "";
            if (escolha == respostas[i]){
                msg = "Parabéns você acertou!!!";
                acertou++;
            } else {
                msg = "Infelizmente você errou!!!";
                errou++;
            }

            JOptionPane.showInternalMessageDialog(null, msg,
                    "Resposta", JOptionPane.INFORMATION_MESSAGE);

        }

        String msg = "User: " + nome + "\n" +
                     "Right: " + acertou + "\n" +
                     "Wrong: " + errou;

        JOptionPane.showInternalMessageDialog(null, msg,
                "Resposta", JOptionPane.INFORMATION_MESSAGE);

    }
}
