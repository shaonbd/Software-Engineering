/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.registration;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @author Jahid
 */
public class DiscountStrategy {
   public static DiscountStrategy instance; 
   IDiscountStrategy ids;
   
   public static synchronized DiscountStrategy getInstance()
    {
        if(instance == null){
            instance = new DiscountStrategy();
        }
        return instance;
    }
   
   public IDiscountStrategy getDiscountStrategy() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException 
    {
        if(ids == null)
        {
            String className ="course.registration."+CourseRegJFrame.getSelectedItem();
            ids = (IDiscountStrategy) Class.forName(className).newInstance();
            
          ids.add(new AcademicExcellenceDiscount());
          ids.add(new FreedomFighterDiscount());
          ids.add(new AboriginalDiscount());
        
    }
        return ids;
}
}
