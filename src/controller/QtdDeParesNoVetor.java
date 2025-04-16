package controller;

public class QtdDeParesNoVetor {

	public QtdDeParesNoVetor() {
		super ();
	}
	public int QtdContarNumerosParesNoVetor(int [] vetor, int i) {
		if (i == vetor.length) {
			return 0;
		}
		if (vetor[i] % 2 == 0) {
			return 1 + QtdContarNumerosParesNoVetor(vetor, i + 1);
		}
		else {
			return QtdContarNumerosParesNoVetor(vetor, i + 1);
		}
	}
}