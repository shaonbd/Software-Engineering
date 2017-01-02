/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.registration;

import java.io.IOException;

/**
 *
 * @author Jahid
 */
public class PropertyListenerFactory {
    public static PropertyListenerFactory instance; 
   IPropertyListener ipl;
   
   public static synchronized PropertyListenerFactory getInstance()
    {
        if(instance == null){
            instance = new PropertyListenerFactory();
        }
        return instance;
    }
   
   public IPropertyListener getPropertyListener() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException 
    {
        if(ipl == null)
        {
            Config config = new Config();
            String className =config.getProperties("propertyListener.class.name");
            ipl = (IPropertyListener) Class.forName(className).newInstance();
}
        return ipl;
    }
}