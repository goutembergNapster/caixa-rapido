package util.constants;

public class ConstantesConfiguracao {

	/**Selenium Test Configuration*/
    //public static final String BROWSER_NAME = Util.getProperties().getProperty("BrowserName");
    public static final String PATH_SCREENSHOT = "./resultados/screenshots/";
    public static final Boolean SILENT_MODE=false;
    //public static final EnumAmbienteSO AMBIENTE_SO = EnumAmbienteSO.WINDOWS;
    public static boolean isLogFindElement=false;

    /**General application settings*/
    //public static final String URL_BASE = Util.getProperties().getProperty("ApplicationURL");
    public static Boolean VERIFICATION_CODE = false;
    public static final String TITULO_PAG_RAIZ="Login | Salesforce";
    public static final String URL_ACESSO_INTEGRADO = "";
    public static final String URL_ACESSO_INTEGRADO_LOGOUT = "";

    /**DB Configurations*/
    public static final String DB_URL = "";
    public static final String DB_USER = "";
    public static final String DB_PASSWORD = "";
    public static final String DB_PREFIX = "jdbc:db2://";
    public static final String DB_CLASSNAME = "com.ibm.db2.jcc.DB2Driver";
    public static final int MAX_TIME_FOR_LOAD_ELEMENT = 20;
    public static final int MAX_TIME_FOR_LOAD_PAGE = 20;

    /**Driver settings*/
    public static final String DRIVER_PATH_LINUX = "./drivers/linux/";
    public static final String DRIVER_PATH_WINDOWS = "./drivers/windows/";
    public static final String CHROME_DRIVER = "chromedriver";
    public static final String GECKO_DRIVER = "geckodriver";
	
}
