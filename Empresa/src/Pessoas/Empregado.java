package Pessoas;

public class Empregado extends Pessoa{

	private String formacao;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
	
	public String toString ()
	{
		return "Nome:		" + getNome() + "\nEmail:		" + getEmail () + "\nEndere�o:	" + getEndereco ()
				+ "\nTelefone:	" + getTelefone () + "\nNascimento:	" + getDataNasc ()
				+ "\nCPF:		" + getCPF () + "\nIdentidade:	" + getIdentidade () + "Forma��o:	" + getFormacao ();
	}
}

