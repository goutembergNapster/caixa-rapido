package util;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import util.constants.ConstantesConfiguracao;
import util.log.Log;

public class Utils {

	
	public static void CapturarTela(AndroidDriver<MobileElement> driver, String testCaseName){
        try {
            File scrFile = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(scrFile, new File(ConstantesConfiguracao.PATH_SCREENSHOT
                    + testCaseName +  gerarData(true)+".jpg"));
        } catch (Exception e) {
            Log.ErrorEnvironment("Class Util > Method CapturarTela throw exception while capturing ScreenShot : "
                    + e.getMessage());
        }
    }
	
	public static String gerarData(boolean semMascara){
        String padraoSaida;
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter original = DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss.SSS").withResolverStyle(ResolverStyle.STRICT);
        if(semMascara){
            padraoSaida="uuuuMMddHHmmss";
        }else{
            padraoSaida="uuuu-MM-dd HH:mm:ss";
        }
        DateTimeFormatter novo = DateTimeFormatter.ofPattern(padraoSaida).withResolverStyle(ResolverStyle.STRICT);
        LocalDateTime dataHora = LocalDateTime.parse(ldt.toString(), original);
        String formatado = dataHora.format(novo);
        return formatado;
    }
	
}
