package pageObject;

import org.openqa.selenium.By;

import driverHelper.BasePage;

public class PageIdentificationByDocuments extends BasePage {
	
	private By input_TabIdentificationPASSPORT;
	private By input_TabIdentificationCNPJ;
	private By input_TabIdentificationRNE;
	private By input_TabIdentificationCPF;

	public By BotaoBuscaCliente () {
	    ElementDescription = "Botao Busca Cliente";
	    waiting(200);
		return By.id("button_identificationSearch");
	}
	public void IdentificacaoPorCNPJ() {
		ElementDescription = "Identificacao Por CNPJ";
		getElements(input_TabIdentificationCNPJ).get(1).click();
	}
	public void IdentificationByPassport() {
		ElementDescription = "Identificacao Por Passaporte";
		getElements(input_TabIdentificationPASSPORT).get(2).click();
	}
	public void IdentificacaoPorRNE () {
		ElementDescription = "Identificacao Por RNE";
		getElements(input_TabIdentificationRNE).get(3).click();
	}
	public void IdentificacaoPorCPF () {
		ElementDescription = "Identificacao Por RNE";
		getElements(input_TabIdentificationCPF).get(3).click();
	}
	public By BuscaCPF() {
		ElementDescription = "Botao busca cliente por CPF";
		return By.xpath("//*[@class='tab-title ng-binding']");
	}
	public By BuscaCNPJ() {
		ElementDescription = "Botao busca cliente por CNPJ";
		return By.xpath("//*[@class='tab-title ng-binding']");
	}
	public By BuscaPassaporte() {
		ElementDescription = "Botao busca cliente por Passaporte";
		return By.xpath("//*[@class='tab-title ng-binding']");
	}
	public By BuscaRNE() {
		ElementDescription = "Botao busca cliente por RNE";
		return By.xpath("//*[@class='tab-title ng-binding']");
	}	
}
