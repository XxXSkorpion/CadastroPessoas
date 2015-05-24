import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControolerCadastroPessoas implements ActionListener {

	private Apresentacao FCadastroPessoas;
	private ModelCadastroPEssoas Cadastrar;

	public ControolerCadastroPessoas() throws Exception {
		FCadastroPessoas = new Apresentacao();
		Cadastrar = new ModelCadastroPEssoas();
		ligaEventos();
	}

	private void ligaEventos() {
		FCadastroPessoas.Gravar.addActionListener(this);
		FCadastroPessoas.Pesquisar.addActionListener(this);
		FCadastroPessoas.Excluir.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (FCadastroPessoas.Pesquisar == e.getSource()) {
			pesquisaDados();

		}
		if (FCadastroPessoas.Gravar == e.getSource()) {
			gravaDados();

		}

		if (FCadastroPessoas.Excluir == e.getSource()) {
			excluirDados();
		}
	}

	private void gravaDados() {
	}

	private void excluirDados() {
	}

	private void pesquisaDados() {
	}

}
