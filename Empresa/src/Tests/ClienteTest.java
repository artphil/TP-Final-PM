package Tests;

import Pessoas.*;
import junit.framework.*;

public class ClienteTest extends TestCase
{
	
	public void testCostrutor ()
	{
		Cliente pessoa = new Cliente ();
		pessoa.setNome("Jo�o do Carmo");
		pessoa.setEndereco("Rua Ararib�, 131");
		pessoa.setCPF("321.654.987-88");
		pessoa.setDataNasc("20/11/1956");
		pessoa.setEmail("joao@domain.com");
		pessoa.setIdentidade("MG16.654.98");
		pessoa.setTelefone("96546-5485");
		
		String esperado = "Nome:		" + "Jo�o do Carmo" + "\nEmail:		" + "joao@domain.com" 
						+ "\nEndere�o:	" + "Rua Ararib�, 131" + "\nTelefone:	" + "96546-5485" 
						+ "\nNascimento:	" + "20/11/1956" + "\nCPF:		" + "321.654.987-88" 
						+ "\nIdentidade:	" + "MG16.654.98";
		
		assertEquals ( esperado, pessoa.toString() );
		
	}
	
}
