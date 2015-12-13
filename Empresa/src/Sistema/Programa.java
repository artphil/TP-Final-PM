package Sistema;

import java.io.*;

import javax.swing.*;

import Interface.*;
import Pessoas.*;
import Servicos.*;

public class Programa {
	
	static Gerenciador sistema;
	
	public static void main(String[] args) throws IOException 
	{
		
		sistema = new Gerenciador();
		
		sistema.listaCliente =  new ListaCliente();
		sistema.listaCliente.preenche();
		sistema.listaTecnico = new ListaTecnico();
		sistema.listaTecnico.preenche();
		
		System.out.println(sistema.listaCliente.toString());
		System.out.println(sistema.listaTecnico.toString());
		
		sistema.janelas[Gerenciador.index] = new JanelaInicio();
		
	}

}
