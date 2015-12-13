package Interface;

import java.awt.event.*;

import javax.swing.*;

import Pessoas.*;

public class BotaoEntraTecnico implements ActionListener
{
	public JFrame janela;
	public Tecnico tecnico;
	
	public BotaoEntraTecnico (JFrame janela)
	{
		this.janela = janela;
	}
	
	public void actionPerformed(ActionEvent ev) 
	{
		janela.setVisible(false);
		janela = new JanelaDadosTecnico (new Tecnico());	
	}
}
