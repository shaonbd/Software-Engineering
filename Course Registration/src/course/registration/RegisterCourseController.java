package course.registration;

import javax.swing.JOptionPane;

public class RegisterCourseController
{
    Registration reg;
    CourseFactory c_factory;
    beepSound beep;
    DiscountStrategy dis;
    
    public RegisterCourseController()
    {
        this.reg = new Registration();
        this.c_factory = new CourseFactory();
    }
    
    public void makeNewRegistration()
    {
        this.reg = new Registration();
        this.dis = new DiscountStrategy();
    }
    
    public void addCourse(String id)
    {
       reg.addCourse(c_factory.getCourseInfo(id));
    }
    
    public Registration getRegistration()
    {
        return this.reg;
    }
    public Course getCourseInfo(String id)
    {
        return c_factory.getCourseInfo(id);
    }
    
}
