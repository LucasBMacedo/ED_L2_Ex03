package view;

import javax.swing.JOptionPane;

import controller.QtdDeParesNoVetor;

public class Principal {

	public static void main(String[] args) {
		QtdDeParesNoVetor qtddeparnovet = new QtdDeParesNoVetor();
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Qual será o tamanho do vetor?"));
		int [] vetor = new int [tamanho];
		int contador1 = 0;
		int contador2 = 0;
		int i;
		for (i = 0; i < tamanho; i ++) {
			vetor [i] = Integer.parseInt(JOptionPane.showInputDialog("insira o valor da posicao " + i + " do vetor maior que 0."));
		}
		JOptionPane.showMessageDialog(null, "A quantidade de números pares nesse vetor é de: " + qtddeparnovet.QtdParVet(vetor, contador1, contador2) + ".");
	}

}
