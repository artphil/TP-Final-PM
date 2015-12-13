package Pessoas;

public class Pessoa {
	
	/* Variaveis de Campo */
	private String 	nome,
	  				endereco,
	  				identidade,
	  				cpf,
	  				email,
	  				telefone,
	  				dataNasc;
	
	/* Fun��es Get */
	public String getNome () 
	{
		return nome;
	};
	
	public String getEndereco () 
	{
		return endereco;
	};
	
	public String getIdentidade () 
	{
		return identidade;
	};
	
	public String getCPF () 
	{
		return cpf;
	};
	
	public String getEmail () 
	{
		return email;
	};
	
	public String getTelefone () 
	{
		return telefone;
	};
	
	public String getDataNasc () 
	{
		return dataNasc;
	};
	
	/* Fun��es Set */
	public void setNome (String nome) 
	{
		this.nome = nome;
	}
	
	public void setEndereco (String endereco) 
	{
		this.endereco = endereco;
	}

	public void setIdentidade (String identidade) 
	{
		this.identidade = identidade;
	};
	
	public void setCPF (String cpf) 
	{
		this.cpf = cpf;
	};
	
	public void setEmail (String email) 
	{
		this.email = email;
	};
	
	public void setTelefone (String telefone) 
	{
		this.telefone = telefone;
	};
	
	public void setDataNasc (String dataNasc) 
	{
		this.dataNasc = dataNasc;
	};
	
	
	/* Fun��o to String*/
	public String toString ()
	{
		return "Nome:		" + getNome () + "\nEmail:		" + getEmail () + "\nEndere�o:	" + getEndereco ()
		+ "\nTelefone:	" + getTelefone () + "\nNascimento:	" + getDataNasc ()
		+ "\nCPF:		" + getCPF () + "\nIdentidade:	" + getIdentidade ();
	}
}
