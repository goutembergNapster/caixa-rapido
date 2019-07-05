package configs;



public class ClientConfigFactory {

	public static ClientConfig getClientConfig(ClientName clientName) {

		if (clientName == null) {
			throw new NullPointerException("Cliente nulo!");
		}
		switch (clientName) {
		case TIM:
			return new TimClientConfig();
		case LEROY:
			return new LeroyClientConfig();
		case DPSP:
			return new DPSPClientConfig();
		default:
			throw new IllegalArgumentException("Cliente inválido: " + clientName.name());
		}
	}
}

