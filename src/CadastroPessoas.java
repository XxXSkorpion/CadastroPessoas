import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class CadastroPessoas implements ActionListener{
	
	public static void main(String[] args) {
		new CadastroPessoas();
	}

	private Apresentacao FCadastroPessoas;
	
	Path Arquivo;
	BufferedReader reader;
	BufferedWriter writer;

	public CadastroPessoas() {
		Arquivo = Paths.get("C:\\"); 
		try {
			reader = new BufferedReader(new FileReader(Arquivo.toFile())); 
			writer = new BufferedWriter(new FileWriter(Arquivo.toFile()));
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		FCadastroPessoas = new Apresentacao();
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
