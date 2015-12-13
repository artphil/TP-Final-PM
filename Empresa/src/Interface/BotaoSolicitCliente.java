package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Pessoas.Cliente;
import Sistema.Gerenciador;

public class BotaoSolicitCliente implements ActionListener
{
	Cliente cliente;
	
	public BotaoSolicitCliente (Cliente cliente)
	{
		this.cliente = cliente;
	}

	public void actionPerformed(ActionEvent e) 
	{
		Gerenciador.janelas[Gerenciador.index].setVisible(false);
		Gerenciador.janelas[++Gerenciador.index] = new JanelaSolicitCliente(cliente);	
	}

}
