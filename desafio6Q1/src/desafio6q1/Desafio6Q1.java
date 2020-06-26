/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio6q1;

/**
 *
 * @author yasmi
 */
public class Desafio6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
      //for - while() - do while()

        int cont, cod, quant, acRato, acCoelho;
        acRato = 0;
        acCoelho = 0;
        for (cont = 1; cont <= 2; cont++) {
            cod = Integer.parseInt(JOptionPane.showInputDialog("Escolha\n"
                    + "1 - Ratos\n"
                    + "2 - Coelhos\n"
                    + "Digite:"));
            if (cod == 1) {
                quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos Ratos?"));
                acRato = acRato + quant;
            } else if (cod == 2) {
                quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos Coelhos?"));
                acCoelho = acCoelho + quant;
            } else {
                JOptionPane.showMessageDialog(null, "Código Inválido, apenas 1 ou 2 "
                        + "- Tente novamente");
                cont--;
            }
        }//fim do loop
        DecimalFormat f = new DecimalFormat("0.0");
        JOptionPane.showMessageDialog(null,"Resultados do dia\n"
            + "-----------------------------------\n"
            + "\nEm "+(cont-1)+" experiências\n"
            + " foram usados "+acRato+" Ratos e "+acCoelho+" Coelhos"
            + " num total de "+(acCoelho+acRato)+" cobaias (ratos e coelhos)\n"
            + "Percentuais:\nRatos "+f.format((acRato/(double)(acRato+acCoelho)*100))+"% - "
            + "Coelhos "+f.format((acCoelho/(double)(acRato+acCoelho)*100))+"%"
            ,"Laboratório Vá com Deus",JOptionPane.ERROR_MESSAGE);
    }

}
