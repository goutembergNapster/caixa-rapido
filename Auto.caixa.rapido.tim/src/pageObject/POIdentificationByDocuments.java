package pageObject;

import org.openqa.selenium.By;

import driverHelper.BasePage;

public class POIdentificationByDocuments extends BasePage {
	
	private final static By IdentificationByCPF = By.id("input_TabIdentificationCPF");
	private final static By IdentificationByCNPJ = By.id("input_TabIdentificationCNPJ");
	private final static By IdentificationByRNE = By.id("input_TabIdentificationRNE");
	private final static By IdentificationByPassport = By.id("input_TabIdentificationPASSPORT");
	
	private final static By SearchCPF = By.xpath("//*[@class='tab-title ng-binding']");
	private final static By SearchCNPJ = By.xpath("//*[@class='tab-title ng-binding']");
	private final static By SearchPassaport = By.xpath("//*[@class='tab-title ng-binding']");
	private final static By SearchRNE = By.xpath("//*[@class='tab-title ng-binding']");
	
	private final static By BtnSearchClient = By.id("button_identificationSearch");
	
	
	public void setClientByCPF(String cpf) {
		writeInput(IdentificationByCPF, cpf);
	}
	
	public void setClientByCNPJ(String cnpj) {
		writeInput(IdentificationByCNPJ, cnpj);
		
	}
	
	public void setClientByRNE(String rne) {
		writeInput(IdentificationByRNE, rne);
	}
	
	public void setClientByPassport(String passport) {
		writeInput(IdentificationByPassport, passport);
	}
	
	public void btnSearchClient() {
		clickElement(BtnSearchClient);
		waiting(200);
	}
	
	public void labelSearchCPF() {
		getElements(SearchCPF).get(1).click();;
	}
	
	public void labelSearchCNPJ() {
		getElements(SearchCNPJ).get(1).click();;
	}

	public void labelSearchRNE() {
		getElements(SearchRNE).get(3).click();
	}
	
	public void labelSearchPassaport() {
	
		getElements(SearchPassaport).get(2).click();
	}

}
