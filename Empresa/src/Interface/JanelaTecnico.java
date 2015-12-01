package Interface;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JanelaTecnico extends JFrame
{
	public JLabel texto;
	public JPanel portatexto;
	
	public JanelaTecnico ()
	{
		/*Texto da barra superior*/
		setTitle("Empresa13 Soluções em Serviços");
		
		/*Texto de informação*/
		portatexto = new JPanel ();
		texto = new JLabel ("TECNICO");
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
