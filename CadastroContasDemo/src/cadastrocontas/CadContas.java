package cadastrocontas;

/**
 * 
 * @author bernardo
 */
public class CadContas {
	private ContaCorrente lst[];
	private int posLivre;
	private static final int MAXCONTAS = 100;

	public CadContas() {
		lst = new ContaCorrente[MAXCONTAS];
		posLivre = 0;
	}

	public boolean novaConta(ContaCorrente c) {
		if (posLivre == MAXCONTAS) {
			return (false);
		}
		lst[posLivre] = c;
		posLivre++;
		return (true);
	}

	public ContaCorrente getConta(int numero) {
		for (int i = 0; i < posLivre; i++) {
			ContaCorrente aux = lst[i];
			if (aux.getNumero() == numero) {
				return (aux);
			}
			/*
			 * Forma mais compacta if (lst[i].getNumero() == numero){
			 * return(lst[i]); }
			 */
		}
		return (null);
	}

	public double getSaldoTotal() {
		double acum = 0.0;
		for (int i = 0; i < posLivre; i++) {
			acum = acum + lst[i].getSaldo();
			// acum += lst[i].getSaldo();
		}
		return (acum);
	}

	public void remove(int nroConta) {
		for (int i = 0; i < posLivre; i++) {
			if (lst[i].getNumero() == nroConta) {
				lst[i] = null;
				for (int j = 0; j < posLivre; i++) {
					if (lst[j] == null) {
						lst[j] = lst[j + 1];
					}
				}
				posLivre--;
			}
		}
	}
}
