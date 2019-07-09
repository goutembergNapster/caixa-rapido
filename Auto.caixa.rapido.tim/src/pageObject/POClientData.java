package pageObject;

import org.openqa.selenium.By;

import driverHelper.BasePage;

public class POClientData extends BasePage {
	
	private final static By SelectCloseButton = By.xpath("//*[@class='button button-clear button-theme button-primary']");
	private final static By Cpf  = By.xpath("//*/span[contains(.,'CPF: ')]");
	private final static By ClientInformation  = By.xpath("//*[@class='ng-binding']");
	private final static By NameClient = By.xpath("//*[@class='ng-binding']");
	private final static By CodeClient = By.xpath("//*[@class='ng-binding']");
	private final static By TelephoneClient = By.xpath("//*[@class='ng-binding']");
	private final static By EmailClient = By.xpath("//*[@ng-pristine ng-untouched ng-valid ng-empty ng-valid-email ng-valid-required']");
	private final static By BtnCancelClient = By.xpath("//*[@class='button button_font_dosis button-block button-stable ng-binding']");
	private final static By BtnSelectClient = By.xpath("//*[@class='button button_font_dosis button-block button-theme ng-binding']");
	
	
	
	public void BtnClose() {
		clickElement(SelectCloseButton);
	}
	
	public void BtnCancelClient() {
		clickElement(BtnCancelClient);
	}
	
	public void BtnSelectClient() {
		clickElement(BtnSelectClient);
	}
	public String getTelephoneClient() {
		return getText(TelephoneClient);
	}
	
	public void setEmailClient(String email) {
		writeInput(EmailClient, email);
	}
	public String getNameClient() {
		return getText(NameClient);
	}
	
	public String getCodeClient () {
		return getText(CodeClient);
		
	}
	
	public String getCpfClient() {
		return getText(Cpf);
		}
	
	public String getCNPJClient() {
		return getElements(ClientInformation).get(1).getText()	;
		}
	
	public String clearLabelCPF() {
        
	    POClientData clientDataPage = new POClientData();
		String cpf = clientDataPage.getCpfClient();
		String replaceCPF = cpf.replaceAll("CPF: ", "");
 		return replaceCPF; 		
		}

	public String clearLabelCNPJ() {
		POClientData clientDataPage = new POClientData();
		String cnpj = clientDataPage.getCNPJClient();
		String replaceCNPJ = cnpj.replaceAll("CNPJ: ", "");
		return replaceCNPJ;
		}

}
