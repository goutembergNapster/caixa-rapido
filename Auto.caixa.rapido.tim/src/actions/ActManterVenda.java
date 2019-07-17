package actions;

import driverHelper.BasePage;
import objetos.Produto;
import pageObject.POCart;
import pageObject.POCart2;
import pageObject.POProductQuery_COPY;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverHelper.*;

public class ActManterVenda extends BasePage {
	
	private static POCart2 pocart = new POCart2();
	private static POProductQuery_COPY poproductQuery_COPY = new POProductQuery_COPY();
	
	public static void ProductSearch(String identificadorUnico) {}
		
	private WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 60);
		
	public static void ConsultarProduto(Produto produto, boolean isPesquisar) {
		writeInput(poproductQuery_COPY.CodeProductField(), produto.getCodigo());
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
	
	









