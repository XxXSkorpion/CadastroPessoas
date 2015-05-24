import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ModelCadastroPEssoas {
  Path Arquivo;
  BufferedReader reader;
  BufferedWriter writer;
  Pessoa pessoa;
  
  
  public ModelCadastroPEssoas() throws Exception{
	 Arquivo = Paths.get("C:\\"); 
	 reader = new BufferedReader(new FileReader(Arquivo.toFile())); 
	 writer = new BufferedWriter(new FileWriter(Arquivo.toFile())); 
  }
  
  public void Grava(String nome, String cpf,String rg, String email){
	Pessoa p = new Pessoa(nome, cpf, rg, email);  
	  
	  
	  
  }
  
  
	
	
	
}
