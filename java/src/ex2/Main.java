package ex2;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = leitor.nextLine();

        String[] array = frase.split("");

        String msg = "";
        
        int triste = 0;
        int feliz = 0;

        for (int i = 0; i < array.length - 2; i++){
            String simbolo = array[i].concat(array[i + 1]);

            if (simbolo.equals(":-")){
                if (array[i + 2].equals(")")){
                    feliz++;
                } else if (array[i + 2].equals("(")) {
                    triste++;
                }
            }
        }

        if (feliz > triste){
            msg = "fun";
        } else if (feliz < triste) {
            msg = "upset";
        } else {
            msg = "neutral";
        }

        System.out.println(msg);

    }
}
