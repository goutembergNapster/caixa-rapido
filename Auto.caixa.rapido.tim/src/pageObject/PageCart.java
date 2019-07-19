package pageObject;

import org.openqa.selenium.By;
import driverHelper.BasePage;

public class PageCart extends BasePage {
	
	public By handsAgreementIcon () {
		ElementDescription = "HandsAgreementIcon";
		return By.xpath("//*/i[@class='fas fa-hands-helping']");
	}
	public By totalCarrinho () {
		ElementDescription = "TotalCarrinho";
		return By.id("homeH1TotalValue");
	}
	public By carrinhoBotaoPagar () {
		ElementDescription = "Carrinho Botão Pagar";
		return By.id("button_fiscalCartProcessDiscount");
	}
	public By labelIdentificacaoCliente () {
		ElementDescription = "LabelIdentificacaoCliente";
		return By.xpath("//*[@class='list-item-dosis']");
	}
	public By botaoIdentificacaoCPF() {
		ElementDescription = "BotaoIdentificacaoCPF";
		return By.xpath("//*[@class='col col-50']/p[.='CPF']/..");
	}
	public By campoInsereCPFCliente() {
		ElementDescription = "CampoCPFCliente";
		return By.xpath("//*[@class='list list-inset pane tab-content']//input");
	}
	public By botaoBuscaCPF() {
		ElementDescription = "BotaoBuscaCPF";
		return By.xpath("//*[@class='button button-block button-theme button_font_dosis']");
	}
	public By listaProdutoCarrinho() {
		ElementDescription = "ListaProdutoCarrinho";
		return By.xpath("//*[@class='item item-remove-animate item-inset item-text-wrap item-complex item-right-editable']");
	}
	public By identificadorUnicoInvalido() {
		ElementDescription = "IdentificadorUnicoInvalido";
		return By.xpath("//*[@class='button ng-binding button-theme'][.='OK']");
	}
	public By botaoNaoCPF() {
		ElementDescription = "BotaoNaoCPF";
		return By.xpath("//*[@class='button ng-binding button-default'][.='Não']");
	}
	public By botaoSimCPF() {
		ElementDescription = "BotaoSimCPF";
		return By.xpath("//*[@class='button ng-binding button-theme']");
	}
	public By botaoFinalizarCarrinho() {
		ElementDescription = "BotaoFinalizarCarrinho";
		return By.id("button_fiscalCartProcessDiscount"); 
	}
	public By splashLoad () {
		ElementDescription = "SplashLoad";
	return By.xpath("//*[@class='loading']");
	}
	public By pagamentoDinheiro() {
		ElementDescription = "PagamentoDinheiro";
		return By.xpath("//*[@class='item item-icon-left']//span[.='Dinheiro']/../..");
	}
	public By pagamentoConvenio() {
		ElementDescription = "PagamentoConvenio"; 
		return By.xpath("//*[@class='item item-icon-left']//span[.='Convênio']/../..");
	}	
}
