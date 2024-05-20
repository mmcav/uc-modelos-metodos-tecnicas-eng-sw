public class Main {

    public static void main(String[] args) {
        SomadorExistente somadorExistente = new SomadorExistente();
        AdaptadorSomadorExistente adaptadorSomadorExistente = new AdaptadorSomadorExistente(somadorExistente);
        Cliente cliente = new Cliente(adaptadorSomadorExistente);
        cliente.executar();
    }

}