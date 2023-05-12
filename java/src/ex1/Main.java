package ex1;

import ex1.Employee;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> listaFuncionarios = new ArrayList<>();
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade funcionários: "));

        for (int i = 0; i < quantidade; i++){
            String nome = JOptionPane.showInputDialog("Digite o nome do funcionário: ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do(a)" + nome + ": "));
            listaFuncionarios.add(new Employee(nome,salario));
        }

        System.out.println(listaFuncionarios);

    }
}