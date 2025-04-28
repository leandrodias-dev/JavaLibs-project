/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectlibs;

/**
 *
 * @author Leandro Dias
 */

import javax.swing.JOptionPane;

public class ProjectLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Entrada do usuário
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        
        String corFavorita = JOptionPane.showInputDialog("Digite sua cor favorita: ");
        String animalFavorito = JOptionPane.showInputDialog("Digite seu animal favorito: ");
        String cidade = JOptionPane.showInputDialog("Digite o nome de uma cidade que vocÊ gostaria de visitar: ");
        
        int anosNoFuturo = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de anos no futuro: "));
        double multiplicadorAltura = Double.parseDouble(JOptionPane.showInputDialog("Digite um número para multiplicar sua altura: "));
        
        String comidaFavorita = JOptionPane.showInputDialog("Digite sua comida favorita: ");
        String superpoder = JOptionPane.showInputDialog("Digite um superpoder: ");
        
        // Cálculos
        int idadeFutura = idade + anosNoFuturo;
        double alturaFutura = altura * multiplicadorAltura;
        
        // Contrução da história
        String historia = "Era uma vez, em um futuro distante, " + nome + " acordou em " + cidade + ".\n" 
                +"Com " + idadeFutura + " anos de idade, agora dominava o poder de "+ superpoder + ", que fazia toda a diferença.\n"
                + "Vestindo roupas da cor " + corFavorita + " e acompanhado de um " + animalFavorito + " falante,\n"
                + nome + " saiu para explorar a cidade e descobriu um restaurante especializado em comida " + comidaFavorita + ".\n"
                +"Curiosamente sua altura havia aumentado para incríveis " + alturaFutura + " metros devido a um fenômeno misterioso.\n"
                +"E assim, " + nome + " embarcou em uma jornada cheia de aventuras inesquecíveis"; 
        
        // Exibição da história
        JOptionPane.showMessageDialog(null, historia);
    }
    
}
