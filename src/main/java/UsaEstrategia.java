public class UsaEstrategia {

    public static void main(String[] args) {

        ExibicaoStrategy exibicao = null;
        int opcaoEstrategia = 2;

        if(opcaoEstrategia==1){
            exibicao = new ExibirConsole();
        }else if(opcaoEstrategia==2){
            exibicao = new ExibeUI();
        }

        exibicao.exibeMensagem("Sábado");

    }
}
