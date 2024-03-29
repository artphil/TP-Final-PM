package Pessoas;

public class Tecnico extends Pessoa{

	private static int serial = 1000; 
	private int matricula;
	private String formacao;

	public Tecnico ()
	{
		matricula = ++serial;
	}
	
	public Tecnico (int numero)
	{
		matricula = numero;
		if (numero > serial)
			serial = numero;
	}
	
	public String getFormacao() 
	{
		return formacao;
	}
	
	public int getMatricula() 
	{
		return matricula;
	}
	
	public void setFormacao(String formacao) 
	{
		this.formacao = formacao;
	}
	
	public String imprime () 
	{
		return "#" + getMatricula() + "#" + getNome () + "#" + getEmail () + "#" + getEndereco () + "#" 
				+ getTelefone () + "#" + getDataNasc ()	+ "#" + getCPF () + "#" + getIdentidade () + "#"
				+ getFormacao () + "#\n";
	}
	
	public String toString ()
	{
		return "\nMatricula:	" + getMatricula () 
				+ "\nNome:		" + getNome() 
				+ "\nEmail:		" + getEmail () 
				+ "\nEndere�o:	" + getEndereco ()
				+ "\nTelefone:	" + getTelefone () 
				+ "\nNascimento:	" + getDataNasc ()
				+ "\nCPF:		" + getCPF () 
				+ "\nIdentidade:	" + getIdentidade () 
				+ "\nForma��o:	" + getFormacao ();
	}
	
}

