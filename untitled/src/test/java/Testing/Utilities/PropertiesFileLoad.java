package Testing.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileLoad {

 public static Properties PropFileLoad(String path) throws IOException {
     File f = new File(path);
     FileInputStream fi = new FileInputStream(f);
     Properties prop = new Properties();
     prop.load(fi);
     return prop;
 }
}