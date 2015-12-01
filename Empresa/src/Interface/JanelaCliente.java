package Interface;

import java.awt.*;
import javax.swing.*;

public class JanelaCliente extends JFrame
{
	public JLabel texto;
	public JPanel portatexto;
	
	public JanelaCliente ()
	{
		/*Texto da barra superior*/
		setTitle("Empresa13 Soluções em Serviços");
		
		/*Texto de informação*/
		portatexto = new JPanel ();
		texto = new JLabel ("CLIENTE");
		texto.setHorizontalTextPosition(SwingConstants.CENTER);
		portatexto.add(texto);
		portatexto.setAlignmentX(Component.CENTER_ALIGNMENT); 
		add(portatexto, BorderLayout.PAGE_START);
		
		/*Configurações da Janela*/
		setSize(800, 600);
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
