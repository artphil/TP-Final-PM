package Interface;

import java.awt.event.*;
import javax.swing.*;

public class BotaoCliente implements ActionListener
{
	public JFrame janela;
	
	public BotaoCliente (JFrame janela)
	{
		this.janela = janela;
	}
	
	public void actionPerformed(ActionEvent ev) 
	{
		janela = new JanelaCliente ();		
	}

}
