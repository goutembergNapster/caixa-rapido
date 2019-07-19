package tests;
import org.junit.Test;


import driverHelper.*;
import configs.*;
import driverHelper.BasePage;
import actions.ManterProduto;
import actions.ManterVenda;

public class Venda extends BaseTest {
	
	private ManterProduto manterProduto = new ManterProduto(); 
	private ManterVenda manterVenda = new ManterVenda();
	
	@Test
	public void VendaDinheiro() {
		
		manterProduto.ConsultarItemDescricao();
		manterProduto.AdicionarProdutoAoCarrinhoSemCPF();
		manterVenda.FinalizarEmDinheiro();
		}
}