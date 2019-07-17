package objetos;

public class Produto {
	String codigo;
	String descricao;
	String identificadorUnico;
	
	public Produto(String _codigo, 	String _descricao, String _identificadorUnico) {
		this.codigo = _codigo;
		this.descricao = _descricao;
		this.identificadorUnico = _identificadorUnico;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIdentificadorUnico() {
		return identificadorUnico;
	}

	public void setIdentificadorUnico(String identificadorUnico) {
		this.identificadorUnico = identificadorUnico;
	}
	
	public static Produto PesquisarAtivo() {
		return new Produto("invalido", "zoado", "cagado");
	}
	
	
	

}
