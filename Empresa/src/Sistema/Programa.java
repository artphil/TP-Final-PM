package Sistema;

import java.io.*;

import javax.swing.*;

import Interface.*;
import Pessoas.*;
import Servicos.*;

public class Programa {
	
	static JFrame janela;
	static ListaCliente listaCliente;
	static ListaTecnico listaTecnico;

	public static void main(String[] args) throws IOException 
	{
		
		
		listaCliente =  new ListaCliente();
		listaCliente.preenche();
		listaTecnico = new ListaTecnico();
		listaTecnico.preenche();
		
		
		
		
		System.out.println(listaCliente.toString());
		
		janela = new JanelaInicio();
	}

}
