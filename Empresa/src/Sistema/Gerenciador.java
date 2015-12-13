package Sistema;

import javax.swing.JFrame;

import Pessoas.ListaCliente;
import Pessoas.ListaTecnico;

public class Gerenciador 
{
	public static JFrame[] janelas;
	public static int index;
	public static ListaCliente listaCliente;
	public static ListaTecnico listaTecnico;
	
	public Gerenciador ()
	{
		janelas = new JFrame[10];
		index = 0;
	}

}
