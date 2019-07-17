package Tests;

import org.junit.Assert;
import org.junit.Test;
import pageObject.*;

import configs.*;
import driverHelper.*;

import driverHelper.BaseTest;

public class MultiplosDocumentos extends BaseTest {
	
	private POClientData clienteDataPage = new POClientData();
	private POIdentificationByDocuments identificationPage = new POIdentificationByDocuments();
	private POClientIdentification clienteIdentification = new POClientIdentification();
	private ClientConfig clientConfig = ClientConfigFactory.getClientConfig(DriverFactory.clientName);

	

}
