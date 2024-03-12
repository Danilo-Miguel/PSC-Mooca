
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;


public class OperadoresComparacao {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        
        
        /*boolean comparador = a == b;;
        boolean diferente = a != b;
        boolean maior = a > b;
        boolean maiorIgual = a >= b;
        boolean menor = a < b;
        boolean menorIgual = a <= b;*/
        
        int num1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero: "));
        int num2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo  numero: "));
       
        boolean comparador = num1 == num2;
        boolean diferente = num1 != num2;
        boolean maior = num1 > num2;
        boolean maiorIgual = num1 >= num2;
        boolean menor = num1 < num2;
        boolean menorIgual = num1 <= num2;
        
        JOptionPane.showMessageDialog(null, comparador);
        JOptionPane.showMessageDialog(null, diferente);
        JOptionPane.showMessageDialog(null, maior);
        JOptionPane.showMessageDialog(null, maiorIgual);
        JOptionPane.showMessageDialog(null, menor);
        JOptionPane.showMessageDialog(null, menorIgual);

        
        System.out.println("A comparação entre as variáveis a e b resulta em " + comparador);
        System.out.println("A comparação entre as variáveis a e b resulta em " + diferente);
        System.out.println("A comparação entre as variáveis a e b resulta em " + maior);
        System.out.println("A comparação entre as variáveis a e b resulta em " + maiorIgual);
        System.out.println("A comparação entre as variáveis a e b resulta em " + menor);
        System.out.println("A comparação entre as variáveis a e b resulta em " + menorIgual);
        
    }
    
}
