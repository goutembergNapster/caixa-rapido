package pageObject;

import org.openqa.selenium.By;
import driverHelper.BasePage;

public class PageCart extends BasePage {
	
	public By HandsAgreementIcon () {
		ElementDescription = "HandsAgreementIcon";
		return By.xpath("//*/i[@class='fas fa-hands-helping']");
	}
	public By TotalCarrinho () {
		ElementDescription = "TotalCarrinho";
		return By.id("homeH1TotalValue");
	}
	public By LabelIdentificacaoCliente () {
		ElementDescription = "LabelIdentificacaoCliente";
		return By.xpath("//*[@class='list-item-dosis']");
	}
	public By BotaoIdentificacaoCPF() {
		ElementDescription = "BotaoIdentificacaoCPF";
		return By.xpath("//*[@class='col col-50']/p[.='CPF']/..");
	}
	public By CampoInsereCPFCliente() {
		ElementDescription = "CampoCPFCliente";
		return By.xpath("//*[@class='list list-inset pane tab-content']//input");
	}
	public By BotaoBuscaCPF() {
		ElementDescription = "BotaoBuscaCPF";
		return By.xpath("//*[@class='button button-block button-theme button_font_dosis']");
	}
	public By ListaProdutoCarrinho() {
		ElementDescription = "ListaProdutoCarrinho";
		return By.xpath("//*[@class='item item-remove-animate item-inset item-text-wrap item-complex item-right-editable']");
	}
	public By IdentificadorUnicoInvalido() {
		ElementDescription = "IdentificadorUnicoInvalido";
		return By.xpath("//*[@class='button ng-binding button-theme'][.='OK']");
	}
	public By BotaoNaoCPF() {
		ElementDescription = "BotaoNaoCPF";
		return By.xpath("//*[@class='button ng-binding button-default'][.='Não']");
	}
	public By BotaoSimCPF() {
		ElementDescription = "BotaoSimCPF";
		return By.xpath("//*[@class='button ng-binding button-theme']");
	}
	public By BotaoFinalizarCarrinho() {
		ElementDescription = "BotaoFinalizarCarrinho";
		return By.id("button_fiscalCartProcessDiscount"); 
	}
	public By SplashLoad () {
		ElementDescription = "SplashLoad";
	return By.xpath("//*[@class='loading']");
	}
	public By PagamentoDinheiro() {
		ElementDescription = "PagamentoDinheiro";
		return By.xpath("//*[@class='item item-icon-left']//span[.='Dinheiro']/../..");
	}
	public By PagamentoConvenio() {
		ElementDescription = "PagamentoConvenio"; 
		return By.xpath("//*[@class='item item-icon-left']//span[.='Convênio']/../..");
	}	
}
