package Interface;

import java.awt.event.*;

import Pessoas.*;
import Sistema.Gerenciador;

public class BotaoConfirmaTecnico implements ActionListener
{
	JanelaCadastroTecnico janela;
	Tecnico tecnico;
	
	public BotaoConfirmaTecnico (JanelaCadastroTecnico janela)
	{
		this.janela = janela;
	}
	
	public void actionPerformed(ActionEvent ev) {
		tecnico = new Tecnico();
		tecnico.setNome(janela.nome.getText());
		tecnico.setCPF(janela.cpf.getText());
		tecnico.setDataNasc(janela.dataNasc.getText());
		tecnico.setEmail(janela.email.getText());
		tecnico.setEndereco(janela.endereco.getText());
		tecnico.setIdentidade(janela.identidade.getText());
		tecnico.setTelefone(janela.telefone.getText());
		
		Gerenciador.listaTecnico.add(tecnico);
		
		janela.setVisible(false);
	}

	
}
