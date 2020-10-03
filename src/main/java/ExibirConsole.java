public class ExibirConsole implements ExibicaoStrategy{

    public void exibeMensagem(String mensagem) {
        System.out.println("Mensagem " + mensagem);
    }
}