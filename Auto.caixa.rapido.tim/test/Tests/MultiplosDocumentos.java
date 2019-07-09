package Tests;

import org.junit.Assert;
import org.junit.Test;
import pageObject.*;

import configs.*;
import driverHelper.*;

import driverHelper.BaseTest;

public class MultiplosDocumentos extends BaseTest {
	
	// private FormOfPaymentPage formOfPaymentPage = new FormOfPaymentPage();
	// private CartPage cartPage = new CartPage();

	private POClientDataPage clienteDataPage = new POClientDataPage();
	private POIdentificationByDocuments identificationPage = new POIdentificationByDocuments();
	private POClientIdentificationPage clienteIdentification = new POClientIdentificationPage();
	private ClientConfig clientConfig = ClientConfigFactory.getClientConfig(DriverFactory.clientName);

	/*
	 * 
	 * @Test public void clientByPassaport() {
	 * 
	 * clienteIdentification.accessIdentificationClientByResgistration();
	 * identificationPage.labelSearchPassaport();
	 * identificationPage.setClientByPassport(clientConfig.getClientByPassport());
	 * identificationPage.btnSearchClient(); //clienteDataPage.BtnCancelClient();
	 * 
	 * }
	 * 
	 * @Test public void clientByRne() {
	 * 
	 * clienteIdentification.accessIdentificationClientByResgistration();
	 * identificationPage.labelSearchRNE();
	 * identificationPage.setClientByRNE(clientConfig.getClientByRNE());
	 * identificationPage.btnSearchClient();
	 * 
	 * }
	 */
	/*
	 * @Test public void clientByCnpj() {
	 * 
	 * clienteIdentification.accessIdentificationClientByResgistration();
	 * identificationPage.labelSearchCNPJ();
	 * identificationPage.setClientByCNPJ(clientConfig.getClientByCNPJ());
	 * identificationPage.btnSearchClient(); //clienteDataPage.BtnCancelClient();
	 * clienteDataPage.clearLabelCNPJ();
	 * 
	 * Assert.assertEquals(clientConfig.getClientByCNPJ(),
	 * clienteDataPage.clearLabelCNPJ());
	 * 
	 * 
	 * clienteDataPage.BtnClose();
	 * 
	 * }
	 */
	@Test
	public void clientByCPF() {

		clienteIdentification.accessIdentificationClientByResgistration();
		identificationPage.labelSearchCPF();
		identificationPage.setClientByCPF(clientConfig.getClientByCPF());
		identificationPage.btnSearchClient();
		clienteDataPage.clearLabelCPF();
		//clienteDataPage.clearLabelCPF();
		
		Assert.assertEquals(clientConfig.getClientByCPF(), clienteDataPage.clearLabelCPF());
	

		clienteDataPage.BtnClose();

	}

	
	  @Test public void clientByCnpj() {
	  
	  clienteIdentification.accessIdentificationClientByResgistration();
	  identificationPage.labelSearchCNPJ();
	  identificationPage.setClientByCNPJ(clientConfig.getClientByCNPJ());
	  identificationPage.btnSearchClient(); 
	  clienteDataPage.clearLabelCNPJ();
	  
	  Assert.assertEquals(clientConfig.getClientByCNPJ(), clienteDataPage.clearLabelCNPJ());
	  
	  
	  clienteDataPage.BtnClose();
	  
	  }
	  
	  
	
	/*
	 * @Test public void clientByRne() {
	 * 
	 * clienteIdentification.accessIdentificationClientByResgistration();
	 * identificationPage.labelSearchRNE();
	 * identificationPage.setClientByRNE(clientConfig.getClientByRNE());
	 * identificationPage.btnSearchClient();
	 * 
	 * }
	 */
	 
	 

}
