import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControolerCadastroPessoas implements ActionListener {

	private apresentacao FCadastroPessoas;
	private ModelCadastroPEssoas Cadastrar;

	public ControolerCadastroPessoas() throws Exception {
		FCadastroPessoas = new apresentacao();
		Cadastrar = new ModelCadastroPEssoas();
		LigaEventos();
	}

	private void LigaEventos() {
		FCadastroPessoas.Gravar.addActionListener(this);
		FCadastroPessoas.Pesquisar.addActionListener(this);
		FCadastroPessoas.Excluir.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (FCadastroPessoas.Pesquisar == e.getSource()) {
			PesquisaDados();

		}
		if (FCadastroPessoas.Gravar == e.getSource()) {
			GravaDados();

		}

		if (FCadastroPessoas.Excluir == e.getSource()) {
			ExcluirDados();
		}
	}

	private void GravaDados() {
	}

	private void ExcluirDados() {
	}

	private void PesquisaDados() {
	}

}
