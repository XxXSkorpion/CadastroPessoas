import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Apresentacao extends JFrame {
	JButton Gravar;
	JButton Pesquisar;
	JButton Excluir;
	JPanel principal;
	JLabel nome;
	JLabel Cpf;
	JLabel Email;
	JLabel rg;
	JTextField nome2;
	JTextField cpf2;
	JTextField email2;
	JTextField rg22;
	JTextField s;
	JFrame Cadastro;
	BorderLayout layout;
	
	
	public void inicializacao(){
	  Gravar = new JButton("Gravar");
	  Pesquisar = new JButton("Pesquisar");
	  Excluir = new JButton("Excluir");
	  nome = new JLabel("Nome");
	  Cpf = new JLabel("Cpf");
	  Email = new JLabel("Email");
	  rg = new JLabel("RG");
	  nome2 = new JTextField();
	  cpf2 = new JTextField();
	  email2 = new JTextField();
	  rg22 = new JTextField();
	  Cadastro = new JFrame("Cadastro Pessoas");
   	  layout = new BorderLayout();
	  Cadastro.setLayout(layout);
	  s = new JTextField();
		
	  this.add(Email,BorderLayout.WEST);
	  this.add(Cpf,BorderLayout.WEST);
	  this.add(Gravar,BorderLayout.WEST);
   	  this.add(Pesquisar,BorderLayout.WEST);
	  this.add(Excluir, BorderLayout.WEST);
	  this.add(nome,BorderLayout.WEST);
	  this.add(rg,BorderLayout.WEST);
	  this.add(email2,BorderLayout.WEST);
	  this.add(cpf2,BorderLayout.WEST);
	  this.add(nome2,BorderLayout.WEST);
	  this.add(rg22,BorderLayout.WEST);
      this.add(s,BorderLayout.WEST);
	 
      ArrumacomponentesTela();
   
      this.setSize(800, 600);
	  this.show();
	}
	

	
	public void ArrumacomponentesTela(){
		  nome2.setBounds(100,40,250,20);
		  nome.setBounds (50, 40, 50, 20); 
		  cpf2.setBounds(100,80,250,20);
		  Cpf.setBounds (50, 80, 50, 20);
		  rg22.setBounds(100,120,250,20);
		  rg.setBounds (50, 120, 50, 20); 
		  email2.setBounds(100,160,250,20);
		  Email.setBounds (50, 160, 50, 20);   
		  Gravar.setBounds(150,500, 92, 25);
		  Pesquisar.setBounds(300,500, 92, 25);
		  Excluir.setBounds(450,500,92,25);
		
		
	}

}
