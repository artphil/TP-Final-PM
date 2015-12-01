package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class BotaoTecnico implements ActionListener
{
	public JFrame janela;
	
	public BotaoTecnico (JFrame janela)
	{
		this.janela = janela;
	}
	
	public void actionPerformed(ActionEvent ev) 
	{
		janela = new JanelaTecnico ();		
	}

}