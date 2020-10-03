import java.util.List;
import java.util.ArrayList;

public class Unipe implements Observado{

    public List<Observador> listaObservadores = new ArrayList<Observador>();
    private String mensagem = "Aula Engenharia";

    public void registrar(Observador observador){
        listaObservadores.add(observador);
    }
    public void remover(Observador observador) {
        listaObservadores.remove(observador);
    }

    public void notificar() {
        for(Observador o : listaObservadores){
            o.atualizar(this.mensagem);
        }
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
        notificar();
    }

}
