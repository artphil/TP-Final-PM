package Servicos;

import Pessoas.Cliente;

public class Solicitacao {

	private static int serial;
	private int numero;
	private Cliente cliente;
	private int estado;
	private float orcamento;
	
	public Solicitacao()
	{
		setNumero(++serial);
		setEstado(1);
	}

	public Solicitacao(Cliente cliente) 
	{
		this();
		setCliente(cliente);
	}

	/* Funções Get */
	public Cliente getCliente()
	{
		return cliente;
	}

	public static int getSerial() 
	{
		return serial;
	}

	public int getNumero() 
	{
		return numero;
	}

	public int getEstado() {
		return estado;
	}

	public float getOrcamento() {
		return orcamento;
	}

	
	/* Funções Set */
	
	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}
	
	public void setSerial(int serial) 
	{
		Solicitacao.serial = serial;
	}

	public void setNumero(int numero) 
	{
		this.numero = numero;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public void setOrcamento(float orcamento) {
		this.orcamento = orcamento;
	}
}
