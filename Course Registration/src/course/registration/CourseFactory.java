
package course.registration;

import java.io.IOException;
import java.util.LinkedList;  
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Properties;

public class CourseFactory 
{
    LinkedList<Course> cList = new LinkedList<Course>();
    IExtraFeeCalculator efCalculator;
    //IExtraFeeCalculator efCalculator1;
    IExtraFeeCalculator efc=new DevelopmentFeeCalculator();
    //IExtraFeeCalculator bd_tax=new BDTaxAdapter();
    static CourseFactory instance;
    
    public CourseFactory()
    {

        Course c1 = new Course();
        c1.setID("CSE327");
        c1.setTitle("Software Engineering");
        c1.setCredit(3);
        c1.setTuitionPerCredit(4500);
        cList.add(c1);
        
        Course c2 = new Course();
        c2.setID("CSE311");
        c2.setTitle("Database Management Systems");
        c2.setCredit(3);
        c2.setTuitionPerCredit(4500);
        cList.add(c2);
        
        Course c3 = new Course();
        c3.setID("CSE323");
        c3.setTitle("Operating Systems Design");
        c3.setCredit(3);
        c3.setTuitionPerCredit(4500);
        cList.add(c3);
        
        Course c4 = new Course();
        c4.setID("CSE331");
        c4.setTitle("Microcomputer Systems");
        c4.setCredit(3);
        c4.setTuitionPerCredit(4500);
        cList.add(c4);
        
        Course c5 = new Course();
        c5.setID("CSE338");
        c5.setTitle("Computer Networks");
        c5.setCredit(3);
        c5.setTuitionPerCredit(4500);
        cList.add(c5);
        
        Course c6 = new Course();
        c6.setID("CSE348");
        c6.setTitle("Articial Intelligence");
        c6.setCredit(3);
        c6.setTuitionPerCredit(4500);
        cList.add(c6);
        
    }
    
    public Course getCourseInfo(String id)
    {
        
        Course ci = new Course();
        Course c_inf = new Course();
        
        for(int i = 0 ; i<cList.size() ; i++)
        {
            ci = cList.get(i);
            if(id.equals(ci.getID()))
            {
                c_inf=ci;
            }
        }
        return c_inf;
    }
    
    public static synchronized CourseFactory getInstance()
    {
        if(instance==null)
            instance=new CourseFactory();
        return instance;
    }
    
    public IExtraFeeCalculator getExtraFeeCalculator() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException{
       if(efCalculator==null)
        {
            //String className=efc.getClass().getName();
            //efCalculator= (IExtraFeeCalculator) Class.forName(className).newInstance();
            Config config = new Config();
            String className = config.getProperties("extraFeecalculator.class.name");
            efCalculator = (IExtraFeeCalculator) Class.forName(className).newInstance();
        }
        
        return efCalculator;
    }/**/
    
}
