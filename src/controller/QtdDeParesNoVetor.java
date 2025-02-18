package controller;

public class QtdDeParesNoVetor {

	public QtdDeParesNoVetor() {
		super ();
	}
	public int QtdParVet(int [] vetor, int contador1, int contador2) {
		if (contador2 == vetor.length) {
			return contador1;
		}
		if (vetor[contador2] % 2 == 0) {
			contador1++;
			contador2++;
			return QtdParVet(vetor, contador1, contador2);
		}
		else {
			contador2++;
			return QtdParVet(vetor, contador1, contador2);
		}
	}

}
