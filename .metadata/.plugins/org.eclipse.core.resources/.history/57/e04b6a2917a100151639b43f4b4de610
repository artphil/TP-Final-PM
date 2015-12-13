package Pessoas;

public class Cliente extends Pessoa{

	private static int serial; 
	private int id;
	
	public Cliente ()
	{
		id = ++serial;
	}
	
	public Cliente (int numero)
	{
		id = numero;
		if (numero > serial)
			serial = numero;
	}

	public int getId() 
	{
		return id;
	}

	public String imprime () 
	{
		return "#" + id + "#" + getNome () + "#" + getEmail () + "#" + getEndereco ()+ "#" 
				+ getTelefone () + "#" + getDataNasc ()	+ "#" + getCPF () + "#" + getIdentidade () + "#\n";
	}
	
	public String toString ()
	{
		return "\nID:		" + id 
				+ "\nNome:		" + getNome () 
				+ "\nEmail:		" + getEmail ()
				+ "\nEndereço:	" + getEndereco ()	
				+ "\nTelefone:	" + getTelefone ()
				+ "\nNascimento:	" + getDataNasc () 	
				+ "\nCPF:		" + getCPF ()
				+ "\nIdentidade:	" + getIdentidade ();
	}
	
}
