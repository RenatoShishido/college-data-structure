package Ordena��o;
import java.util.Random;

public class TestaBusca {

	private static final int n = 1000000;

	private static final int numBuscas = 10000;

	public static void main(String[] args) {
		System.out.printf("Tamanho do vetor: %d\n", n);
		System.out.printf("Número de buscas: %d\n", numBuscas);

		int[] v = new int[n];
		for (int i = 0; i < n; ++i)
			v[i] = i;

		Random r = new Random();

		long iniBusca = System.currentTimeMillis();
		for (int i = 0; i < numBuscas; ++i)
			Busca.buscaSequencial(v, r.nextInt(n));
		// Busca.buscaBinaria(v, r.nextInt(n));
		long tmpBusca = System.currentTimeMillis() - iniBusca;

		System.out.printf("    Tempo busca: %f segs\n", tmpBusca / 1000.0);
	}

}
