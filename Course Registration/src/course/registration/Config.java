/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.registration;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 *
 * @author Jahid
 */
class Config {
    public String getProperties(String propertyName) throws IOException {
        Properties prop = new Properties();
        String propFileName = "config.properties";
        
 
       InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        prop.load(inputStream);
        if (inputStream == null) {
            throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
        }
        return "course.registration."+prop.getProperty(propertyName);
        
    }
}
