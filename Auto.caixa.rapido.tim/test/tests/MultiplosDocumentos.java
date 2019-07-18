package tests;

import org.junit.Assert;
import org.junit.Test;
import pageObject.*;

import configs.*;
import driverHelper.*;

import driverHelper.BaseTest;

public class MultiplosDocumentos extends BaseTest {
	
	private PageClientData clienteDataPage = new PageClientData();
	private PageIdentificationByDocuments identificationPage = new PageIdentificationByDocuments();
	private PageClientIdentification clienteIdentification = new PageClientIdentification();
	private ClientConfig clientConfig = ClientConfigFactory.getClientConfig(DriverFactory.clientName);

	

}
