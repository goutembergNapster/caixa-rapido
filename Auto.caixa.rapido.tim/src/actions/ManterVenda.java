package actions;

import driverHelper.BasePage;
import objetos.Produto;
import pageObject.PageCart;
import pageObject.PageCart;
import pageObject.PageProductQuery;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverHelper.*;

public class ManterVenda extends BasePage {
	
	private static PageCart pocart = new PageCart();
	private static PageProductQuery poproductQuery_COPY = new PageProductQuery();
	
	public static void ProductSearch(String identificadorUnico) {}
		
	private WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 60);
		
	public void ConsultarProduto(String produto, boolean isPesquisar) {
		writeInput(poproductQuery_COPY.codeProductField(), produto.getCodigo());
		writeInput(poproductQuery_COPY.input_productSearchDescription(), produto.getDescricao());
		writeInput(poproductQuery_COPY.input_productSearchUniqueId(),produto.getIdentificadorUnico());
		if(isPesquisar){
		clickElement(poproductQuery_COPY.button_productSearch());
		}
	}
	public static void AdicionarProdutoAoCarrinho(Produto produto, String referenciaProduto) {
		
		//clickElement(funcaoSelecionaItemLinhaPorReferencia(referenciaProduto, /*colunaRetorno*/));
		if("mensagemExibidaNoModal".startsWith("mensagemIdentificadorUnico"));
		writeInput(poproductQuery_COPY.input_productSearchUniqueId(), produto.getIdentificadorUnico());
		//clickElement(poproductQuery_COPY.);
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
	
	









