package utils;

import java.net.URL;
import java.net.http.HttpRequest;

public class Constant {
	public final static	URL path=Constant.class.getClassLoader().getResource("Properties\\config.properties");
	public final static URL path2=Constant.class.getClassLoader().getResource("\\src\\test\\java\\Resource\\chromedriver.exe");
	 
public final static String CONFIG_PROPERTIES_DIRECTORY=path.toString();
//"Properties\\config.properties";
public final static String CHROME_DRIVER_DIRECTORY=path2.toString();
//"\\src\\test\\java\\Resource\\chromedriver.exe";
}
