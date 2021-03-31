package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
public static String getValueForKey(String key)throws Throwable
{
Properties confingProperties = new Properties();
confingProperties.load(new FileInputStream("G:\\9OClock_Selenium\\ERP_StockMaven\\PropertyFile\\Environment.properties"));
return confingProperties.getProperty(key);
}

}
