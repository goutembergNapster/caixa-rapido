package objetos;

public class Cliente {
	
	String nomeCliente;
	String CPFCliente;
	String CPFFiscal;
	String isIdentificarClienteNoPagamento;
	String isIdentificarComCPF;
	
	public Cliente(String _nomeCliente, String _CPFCliente, String _CPFFiscal, String _isIdentificarClienteNoPagamento, String _isIdentificarComCPF) {
	
	this.nomeCliente = _nomeCliente;
	this.CPFCliente = _CPFCliente;
	this.CPFFiscal = _CPFFiscal;
	this.isIdentificarClienteNoPagamento = _isIdentificarClienteNoPagamento;
	this.isIdentificarComCPF = _isIdentificarComCPF;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCPFCliente() {
		return CPFCliente;
	}
	public void setCPFCliente(String cPFCliente) {
		CPFCliente = cPFCliente;
	}
	public String getCPFFiscal() {
		return CPFFiscal;
	}
	public void setCPFFiscal(String cPFFiscal) {
		CPFFiscal = cPFFiscal;
	}
	public String getIsIdentificarClienteNoPagamento() {
		return isIdentificarClienteNoPagamento;
	}
	public void setIsIdentificarClienteNoPagamento(String isIdentificarClienteNoPagamento) {
		this.isIdentificarClienteNoPagamento = isIdentificarClienteNoPagamento;
	}
	public String getIsIdentificarComCPF() {
		return isIdentificarComCPF;
	}
	public void setIsIdentificarComCPF(String isIdentificarComCPF) {
		this.isIdentificarComCPF = isIdentificarComCPF;
	}
}
