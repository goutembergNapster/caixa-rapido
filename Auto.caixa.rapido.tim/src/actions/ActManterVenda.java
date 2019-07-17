package actions;

import driverHelper.BasePage;
import objetos.Produto;
import pageObject.POCart;
import pageObject.POCart2;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverHelper.*;

public class ActManterVenda extends BasePage {
	
	private static POCart2 pocart = new POCart2();
	
	public static void ProductSearch(String identificadorUnico) {}
		
	private WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 60);
		
	public static void ConsultarProduto(Produto produto, boolean isPesquisar) {
		writeInput(campocodigpo, produto.getCodigo());
		writeInput(campodescricao,produto.getDescricao());
		writeInput(campoidentificador,produto.getIdentificadorUnico());
		if(isPesquisar){
		clickElement(botaoPesquisar);
		}
	}
	public static void AdicionarProdutoAoCarrinho(Produto produto, String referenciaProduto) {
		
		clickElement(funcaoSelecionaItemLinhaPorReferencia(referenciaProduto, colunaRetorno));
		if("mensagemExibidaNoModal".startsWith("mensagemIdentificadorUnico")) {
		writeInput(campoidentificador, produto.getIdentificadorUnico());
		clickElement(botaoOkMensagem);
		}
		
	}	
	public static void RealizarVenda(Produto produto,boolean isPesquisar) {
		ConsultarProduto(produto, isPesquisar);
		AdicionarProdutoAoCarrinho(produto, produto.getCodigo());
	}
	public static void teste() {
		Produto p = new Produto("cod", "desc", "ident");
		
		Produto pA = Produto.PesquisarAtivo();
		
		RealizarVenda(p, true);
	}


		

}
	
	









