package pageObject;

import org.openqa.selenium.By;

import driverHelper.BasePage;

public class PageClientData extends BasePage {
	
    private final static By TelephoneClient = By.xpath("//*[@class='ng-binding']");
	private final static By EmailClient = By.xpath("//*[@ng-pristine ng-untouched ng-valid ng-empty ng-valid-email ng-valid-required']");
	
	public By botaoFechar () {
		ElementDescription = "Botão Fechar";
		return By.xpath("//*[@class='button button-clear button-theme button-primary']");
	}
	public By campoCPF() {
		ElementDescription = "CampoCPF";
		return By.xpath("//*/span[contains(.,'CPF: ')]");
	}
	public By informacaoCliente() {
		ElementDescription = " Campo Informação do Cliente";
		return By.xpath("//*[@class='ng-binding']"); 
	}
	public By nomeDoCliente() {
		ElementDescription = "Nome do Cliente";
		return By.xpath("//*[@class='ng-binding']"); 
	}
	public By codigoDoCliente() {
		ElementDescription = "Codigo do Cliente";
		return By.xpath("//*[@class='ng-binding']"); 
	}	
	public By botaoCancelarCliente() {
		ElementDescription = "Botão Cancelar Cliente";
		return By.xpath("//*[@class='button button_font_dosis button-block button-stable ng-binding']");
	}
	public By botaoSelecionarCliente() {
		ElementDescription = "Botão Selecionar Cliente";
		return By.xpath("//*[@class='button button_font_dosis button-block button-theme ng-binding']");
	}
	public void setTelephoneClient(String telefone) {
		writeInput(TelephoneClient, telefone);
	}
	public void setEmailClient(String email) {
		writeInput(EmailClient, email);
	}
}
