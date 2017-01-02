package course.registration;

import java.io.IOException;
import static java.time.Clock.system;
import java.util.LinkedList;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Registration 
{
    int total;
    IExtraFeeCalculator iefc;
    LinkedList<Course> courseList;
    ArrayList<Integer> arrlist = new ArrayList<Integer>(20
    );
   // ArrayList<IPropertyListener> propertyListeners;
    IDiscountStrategy ids;
   IPropertyListener pl;
   int disc=0;
  // beepSound beep;
    int grandTotal;
    
    public Registration()
    {
        LinkedList<Course> courseList = new LinkedList<Course>();
        this.courseList = courseList;
        this.grandTotal = 0;
    }
    
    public void setRegistration(LinkedList<Course> r)
    {
        this.courseList = r;
    }
    public LinkedList<Course> getRegistration()
    {
        return this.courseList;
    }
    
    public void addCourse(Course ci)
    {
        courseList.add(ci);
    }
    
    public int getRawTotal() {
        return total;
    }
    
    public int getTotal() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException
    {
        total= 0;
        for(int i=0;i<courseList.size();i++)
        {
            total+= courseList.get(i).getSubTotal();
        }
       //ids = DiscountStrategy.getInstance().getDiscountStrategy();
      // return ids.getTotal(this);
        return total;
    }
    public int getGrandTotal() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException 
    {
        this.grandTotal = this.getTotal() + this.getExtraFeeAmount();
        return this.grandTotal-this.getDiscountAmount();
    }

    
    public int getExtraFeeAmount() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException
    {
        iefc= CourseFactory.getInstance().getExtraFeeCalculator();
        return iefc.getExtraAmount(this.getTotal());
    }
    
    public int getDiscountAmount() throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException
    {
        ids = DiscountStrategy.getInstance().getDiscountStrategy();
        return ids.getTotal(this);
    }
    
    //user / subscriber
    
    public void addListenerToReg() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException{
        
        pl = PropertyListenerFactory.getInstance().getPropertyListener();
        pl.onPropertyEvent();

    }
    public void publishPropertyEvent() throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException{
        disc = getDiscountAmount();
        if(!arrlist.contains(disc))
        {
            addListenerToReg();
            arrlist.add(disc);
        }
    }
    /*
     public void addPropertyListener(IPropertyListener lis) { 
        propertyListeners.add(lis);
       
    }

    public void publishPropertyEvent() {
        for (IPropertyListener pl : propertyListeners) {
            pl.onPropertyEvent();
       }
    }
    
    public void setGrandTotal(int setTotal) throws ClassNotFoundException, IllegalAccessException, InstantiationException, IOException{
        if(this.grandTotal != setTotal ){
            publishPropertyEvent();
        }

    }*/

}
