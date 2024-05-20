import java.util.List;
import java.util.Arrays;

public class AdaptadorSomadorExistente implements SomadorEsperado {
    private SomadorExistente somadorExistente;

    public AdaptadorSomadorExistente(SomadorExistente somadorExistente) {
        this.somadorExistente = somadorExistente;
    }

    public int somaVetor(int[] vetor) {
        List<Integer> lista = Arrays.stream(vetor).boxed().toList();
        return somadorExistente.somaLista(lista);
    }
}