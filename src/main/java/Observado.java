public interface Observado {

    public void registrar(Observador observador);

    public void remover(Observador observador);

    public void notificar();

}
