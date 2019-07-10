package util.log;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;

import driverHelper.BasePage;
import driverHelper.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import util.Utils;

public class Log {
    private static AndroidDriver driver;
    public Log(){
        driver = DriverFactory.driver;
    }
    //Initialize Log4j logs
    private static Logger logger= Logger.getLogger(Log.class.getName());

    //Variáveis do log
    private static boolean isLogFindElement = true;//ConstantesConfiguracao.isLogFindElement;
    private static String so= "Android";
    		//Utils.getProperties().getProperty("TestEnvironment").toUpperCase();
    //private static String browser=Utils.getProperties().getProperty("BrowserName").toUpperCase();
    //private static String urlBase=Utils.getProperties().getProperty("ApplicationURL");
    private static String[] expectedResults;
    private static String resultado = "";

    public static void Info(String s){logger.info(s);}
    public static void InfoEnvironment(String s) { }
    public static void Error(String s) { logger.error(s); }
    public static void ErrorEnvironment(String s) { }
    public static void Fail(String s) { logger.fatal(s); }
    public static void createLog(String testCaseName, String[] objetivos, String[] precondicao, String[] resultadoEsperado){
        DOMConfigurator.configure(".//utils/util/log/log4j.xml");
        IniciarTestCase(testCaseName);
        DescreverTestCase(objetivos,precondicao);
        expectedResults=resultadoEsperado;
    }
    // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite
    public static void IniciarTestCase(String testCaseName){

        Log.Info("***************************************************************************************************");
        Log.Info("***************************************************************************************************");
        Log.Info("                 "+testCaseName);
        Log.Info("***************************************************************************************************");
        Log.Info("***************************************************************************************************\n");
        Log.Info("Ambiente da execução:");
        Log.Info("Sistema Operacional "+so);
      //  Log.Info("Browser "+browser);
       // Log.Info("URL base "+urlBase+"\n");
    }

    public static void DescreverTestCase(String[] objetivos, String[] precondicao) {
        if(objetivos != null){
            Info("Objetivos: ");
            for(String obj : objetivos){
                Info(obj);
            }
            Info("___________________________________________________________________________________________________");
        }
        if(precondicao != null){
            Info("Pré-requisitos: ");
            for(int j = 0 ; j < precondicao.length ; j++){
                Info(j+1 + ". " + precondicao[j]);
            }
            Info("___________________________________________________________________________________________________");
        }

        Info("Passos do Teste: ");
    }
    public static void MensagemValidacao(String feedbackBase){
    String[] assertionArray = feedbackBase.split("\n");
        for (String msg : assertionArray) {
            Info("Validação: "+msg);
        }
    }
    public static void ResultadoEsperado(String[] resultadoEsperado){
        if(resultadoEsperado != null){
            Info("___________________________________________________________________________________________________");
            Info("Resultado Esperado: ");
            for(int j = 0 ; j < resultadoEsperado.length ; j++){
                Info(j+1 + ". " + resultadoEsperado[j]);
            }
        }

        Info("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        Info("Validações:");
    }

    //This is to print log for the ending of the test case
    public static void EncerrarTestCase(){
        if(BasePage.resultado){resultado="APROVADO";}else{resultado="REPROVADO";}
        ResultadoEsperado(expectedResults);
        Log.Info("XXXXXXXXXXXXXXXXXXXXXXXX                "+"-E---N---D-"+"                XXXXXXXXXXXXXXXXXXXXXXXXXX");
        Log.Info("X");
        Log.Info("Resultado do teste: "+resultado);
        Log.Info("X");
        Log.Info("X");
    }
    /// <summary>
    /// Método que monta a mensagem de feedback para cada ação do usuário na tela
    /// </summary>
    /// <param name="acao">Ação que será executada em um determinado objeto, exemplo, clique, preenchimento, duplo clique e etc.</param>
    /// <param name="objeto">Objeto alvo da ação, exemplo, campod e pesquisa, botão enviar, botão salvar, e etc.</param>
    public static void PassoAPasso(String acao,String objeto)
    {
        Log.Info(String.format("An action "+"%1$s"+" executed on "+"%2$s"+".",acao,objeto));
        
    }
    public static void FalhaPassoAPasso(String acao,String objeto)
    {
        Log.Info(String.format("Uma ação de "+"%1$s"+" foi executada em "+"%2$s"+".",acao,objeto));
    }
    public static void SuccessFindElement(String descritivoElemento)
    {
        if (isLogFindElement)
        {
            Log.Info(String.format("%1$s"+" foi encontrado.", descritivoElemento));
        }
        else
        {
            Log.InfoEnvironment(String.format("%1$s"+" foi encontrado.", descritivoElemento));
        }
    }
    public static void ErrorFindElement(String descritivoElemento)
    {
        if (isLogFindElement)
        {
            Log.Error(String.format("%1$s"+" não foi encontrado.", descritivoElemento));
        }
        else
        {
            Log.ErrorEnvironment(String.format("%1$s"+" não foi encontrado.", descritivoElemento));
        }
    }
    public static void FailExecutionTest(String msg, String testCaseNm){
        Log.Fail(String.format("A execução do teste("+"%1$s"+") foi abortada por obter uma falha, com a mensagem: "+"%2$s",testCaseNm, msg));
        Utils.CapturarTela(DriverFactory.driver, testCaseNm);
        BasePage.resultado =false;
        Assert.fail();
    }
    public static void SucessoValidacao(String validacao, String testCaseNm)
    {
        Log.MensagemValidacao(String.format("A validação "+"%1$s"+" do teste "+"%2$s"+" obteve SUCESSO.",validacao, testCaseNm));
        BasePage.resultado =true;
        Utils.CapturarTela(DriverFactory.driver, testCaseNm);
    }
    public static void FalhaValidacao(String validacao, String testCaseNm)
    {
        Log.MensagemValidacao(String.format("A validacao "+"%1$s"+" do teste "+"%2$s"+" obteve FALHA.", validacao, testCaseNm));
        BasePage.resultado =false;
        Utils.CapturarTela(DriverFactory.driver, testCaseNm);
    }

}
