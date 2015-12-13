package Interface;

import java.awt.event.*;

import javax.swing.*;

import Pessoas.*;
import Sistema.Gerenciador;

public class BotaoEntraCliente implements ActionListener
{
	public Cliente cliente;
	JanelaCliente janela;
	
	public BotaoEntraCliente (JanelaCliente janela)
	{
		this.janela = janela;
	}
	
	public void actionPerformed(ActionEvent ev) 
	{
		cliente = Gerenciador.listaCliente.Busca(janela.nome.getText(), janela.cpf.getText(), janela.telefone.getText());
		
		if (cliente != null)
		{
			Gerenciador.janelas[Gerenciador.index].setVisible(false);
			Gerenciador.janelas[++Gerenciador.index] = new JanelaDadosCliente(cliente);	
		}
		else
		{
			int dialogButton = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog (null, "Usuário não cadastrado \ndeseja cadastrar agora?","Cliente não encontrado",dialogButton);

            if(dialogButton == JOptionPane.YES_OPTION)
            {
            	new JanelaCadastroCliente();
            }
		}
	}

}
