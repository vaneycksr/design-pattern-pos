import javax.swing.*;

public class ExibeUI implements ExibicaoStrategy{

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null,mensagem);
    }
}