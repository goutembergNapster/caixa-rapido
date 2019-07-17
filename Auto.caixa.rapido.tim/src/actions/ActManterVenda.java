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
		if(isPesquisar) {
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
	public static void pagarSemCPF() {
	    clickElement(pocart.BotaoNaoCPF());
	    }
	public static void pagarComCPF() {
	    clickElement(pocart.BotaoSimCPF());
	    }
	public String InsereCPF(String cpfCliente) {
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(pocart.SplashLoad()));
	    writeInput(pocart.CampoInsereCPFCliente(), cpfCliente);
	    }
	public static void FinalizaEmDinheiro() {
	    clickElement(pocart.PagamentoDinheiro());
	    }
	public static void FinalizaConvenio() {
	    clickElement(pocart.PagamentoConvenio());
	    }	    
	public int qtdItensCarrinho(int produtoCarrinho) {
		return getElements(pocart.ListaProdutoCarrinho());
		}
	public String getTotalCarrinho() {
		return getText(TotalCartLabel);
		}
	public static void popUpIdentificadorUnicoInvalido(){
		clickElement(pocart.IdentificadorUnicoInvalido());
		}
	public static void finalizarCarrinho( splashLoad){
		wait.until(ExpectedConditions.invisibilityOfElementLocated(pocart.SplashLoad());
		clickElement(pocart.BotaoFinalizarCarrinho());
		}
	public void popupCPFInNoteNot() {
		clickElement(CPFInNoteNotButton);
		}
	public void popupCPFInNoteYes() {
		clickElement(CPFInNoteYesButton);
		}
	public boolean isHandsPresent() {
		return isPresentElement(HandsAgreementIcon);
		}
	public void identifyClientByCPF(String cpf) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(SplashLoad));

		clickElement(IdentifyClientLabel);
		clickElement(CPFIdentificationButton);
		writeInput(CPFClientField, cpf);

		wait.until(ExpectedConditions.presenceOfElementLocated(SearchCPFClientButton));

		getElements(SearchCPFClientButton).get(1).click();
		}
		

	}
	
	
}








