package Interface;

import java.awt.event.*;

import javax.swing.JFrame;

public class BotaoVolta  implements ActionListener
{
	
public JFrame janela;
	
	public BotaoVolta (JFrame janela)
	{
		this.janela = janela;
	}
	
	public void actionPerformed(ActionEvent ev) 
	{
		janela.setVisible(false);
		janela = new JanelaInicio ();		
	}

}
