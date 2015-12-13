package Interface;

import java.awt.event.*;

import javax.swing.*;

import Pessoas.*;
import Sistema.Gerenciador;

public class BotaoEntraTecnico implements ActionListener
{
	public Tecnico tecnico;
	JanelaTecnico janela;
	
	public BotaoEntraTecnico (JanelaTecnico janela)
	{
		this.janela = janela;
	}
	public void actionPerformed(ActionEvent ev) 
	{
		tecnico = Gerenciador.listaTecnico.Busca(Integer.parseInt(janela.matricula.getText()));
		
		if (tecnico != null)
		{
			Gerenciador.janelas[Gerenciador.index].setVisible(false);
			Gerenciador.janelas[++Gerenciador.index] = new JanelaDadosTecnico(tecnico);	
		}
		else
		{
			int dialogButton = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog (null, "Would You Like to Save your Previous Note First?","Warning",dialogButton);

            if(dialogButton == JOptionPane.YES_OPTION){ }
		}
	}
}
